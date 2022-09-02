package com.atguigu.dao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class JDKProxy {
    public static void main(String[] args) {
        //创建接口实现类的代理对象
        Class[]interfaces = {UserDao.class};

        UserdaoImpl userdao = new UserdaoImpl();
    UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(),interfaces,new UserDaoProxy(userdao));
    int re = dao.add(1,3);
        System.out.println(re);
    }
}

class UserDaoProxy implements InvocationHandler{
   //把创建的代理对象传递过来
    private Object obj;
    public UserDaoProxy(Object obj){
        this.obj = obj;
    }

    //增强逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //方法之前
        System.out.println("方法之前");

        //被增强的方法
        System.out.println(method.invoke(obj,args));


        //方法之后
        System.out.println("方法后");
        return method.invoke(obj,args) ;
    }
}