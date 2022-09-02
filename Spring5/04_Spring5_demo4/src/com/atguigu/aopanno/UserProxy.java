package com.atguigu.aopanno;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//增强的类
@Component
@Aspect //生成代理对象

public class UserProxy {
    //前置通知
    @Before(value = "execution(* com.atguigu.aopanno.User.add(..))")
    public void before(){
        System.out.println("beFore....");
    }

    @After(value = "execution(* com.atguigu.aopanno.User.add(..))")
    public void after(){
        System.out.println("after....");
    }







}
