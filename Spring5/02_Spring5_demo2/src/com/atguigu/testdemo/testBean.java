package com.atguigu.testdemo;

import com.atguigu.bean.Emp;
import com.atguigu.service.Userservice;
import com.atguigu.spring5.book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testBean {

@Test
public void testAdd(){
    //1:加载配置文件
    ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

    //2:获取配置创建对象
    Userservice userService = context.getBean("userService", Userservice.class);

    userService.add();
}


    @Test
    public void testAdd2(){
        //1:加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        //2:获取配置创建对象
        Emp emp = context.getBean("emp", Emp.class);

        emp.add();
    }


}
