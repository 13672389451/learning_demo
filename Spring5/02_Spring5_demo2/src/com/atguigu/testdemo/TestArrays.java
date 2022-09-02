package com.atguigu.testdemo;

import com.atguigu.bean.Orders;
import com.atguigu.bean.Stu;
import com.atguigu.factoryBean.Mybean;
import com.atguigu.service.Userservice;
import com.atguigu.bean.book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestArrays {
    @Test
    public void Testdemo1(){

        //1:加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2:获取配置创建对象
        Stu stu = context.getBean("stu", Stu.class);

        stu.test();
    }

    @Test
    public void Testdemo2(){

        //1:加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        //2:获取配置创建对象
        book book = context.getBean("book", book.class);

        book.test();
    }

    @Test
    public void Test(){

        //1:加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        //2:获取配置创建对象
        Mybean mybean = context.getBean("myBean", Mybean.class);

       // mybean.test();
        System.out.println(mybean);
    }

    @Test
    public void Test4(){

        //1:加载配置文件
      //  ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        //2:获取配置创建对象
        Orders orders = context.getBean("orders", Orders.class);

        // mybean.test();
        //System.out.println(mybean);
        System.out.println("4：获取创建的实例对象");
        System.out.println(orders);

        //手动销毁
        context.close();
    }


}
