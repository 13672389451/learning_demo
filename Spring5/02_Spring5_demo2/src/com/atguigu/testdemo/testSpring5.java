package com.atguigu.testdemo;

import com.atguigu.spring5.Orders;
import com.atguigu.spring5.User;
import com.atguigu.spring5.book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;

public class testSpring5 {
    @Test
    public void testAdd(){
        //1:���������ļ�


        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2:��ȡ���ô�������
        User user = context.getBean("user",User.class);

        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook(){
        //1:���������ļ�
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2:��ȡ���ô�������
        book book = context.getBean("book", book.class);

        System.out.println(book);
        book.testDemo();
    }

    @Test
    public void testOrder(){
        //1:���������ļ�
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2:��ȡ���ô�������
        Orders orders = context.getBean("orders", Orders.class);

        System.out.println(orders);
        orders.ordersTest();
    }

}
