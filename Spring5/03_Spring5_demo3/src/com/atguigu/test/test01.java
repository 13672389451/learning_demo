package com.atguigu.test;

import com.atguigu.config.SpringConfig;
import com.atguigu.service.UserSevice;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test01 {
    @Test
    public void testService(){

        //1:加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        UserSevice userService = context.getBean("userService", UserSevice.class);

        System.out.println(userService);

        userService.add();
    }


    @Test
    public void test02(){

        //1:加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        UserSevice userService = context.getBean("userService", UserSevice.class);

        System.out.println(userService);

        userService.add();
    }




}
