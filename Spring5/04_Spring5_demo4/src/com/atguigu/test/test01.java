package com.atguigu.test;

import com.atguigu.aopanno.User;
import com.atguigu.aopxml.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test01{
    @Test
    public void test(){

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        User user = context.getBean("user",User.class);
        user.add();
    }

    @Test
    public void test02(){

        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        Book book = context.getBean("book",Book.class);
        book.buy();
    }



}