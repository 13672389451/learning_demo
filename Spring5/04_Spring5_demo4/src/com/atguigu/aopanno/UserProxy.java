package com.atguigu.aopanno;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//��ǿ����
@Component
@Aspect //���ɴ������

public class UserProxy {
    //ǰ��֪ͨ
    @Before(value = "execution(* com.atguigu.aopanno.User.add(..))")
    public void before(){
        System.out.println("beFore....");
    }

    @After(value = "execution(* com.atguigu.aopanno.User.add(..))")
    public void after(){
        System.out.println("after....");
    }







}
