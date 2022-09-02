package com.atguigu.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ��̬����
 */
public class JDKProxy {
    public static void main(String[] args) {
        //�����ӿ�ʵ����Ĵ������
        Class[]interfaces = {UserDao.class};

        UserdaoImpl userdao = new UserdaoImpl();
    UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),interfaces,new UserDaoProxy(userdao));
    int re = dao.add(1,3);
        System.out.println(re);
    }
}

class UserDaoProxy implements InvocationHandler{
   //�Ѵ����Ĵ�����󴫵ݹ���
    private Object obj;
    public UserDaoProxy(Object obj){
        this.obj = obj;
    }

    //��ǿ�߼�
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //����֮ǰ
        System.out.println("����֮ǰ");

        //����ǿ�ķ���
        System.out.println(method.invoke(obj,args));


        //����֮��
        System.out.println("������");
        return method.invoke(obj,args) ;
    }
}