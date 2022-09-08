package test.java.cn.bugstack.springframework.test;

import main.java.BeansException;
import main.java.cn.bugstack.springframework.beans.factory.config.BeanDefinition;
import main.java.cn.bugstack.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.Test;
import test.java.cn.bugstack.springframework.test.bean.UserService;

public class ApiTest {

    @Test
    public void test_BeanFactory(){
        // 1.��ʼ�� BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.ע�� bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.��һ�λ�ȡ bean
        UserService userService = null;
        try {
            userService = (UserService) beanFactory.getBean("userService");
        } catch (BeansException e) {
            e.printStackTrace();
        }
        userService.queryUserInfo();

        // 4.�ڶ��λ�ȡ bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getSingleton("userService");
        userService_singleton.queryUserInfo();
    }

}
