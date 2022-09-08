package test.java.cn.bugstack.springframework.test;

import main.java.cn.bugstack.springframework.BeanDefinition;
import main.java.cn.bugstack.springframework.BeanFactory;
import org.junit.Test;
import test.java.cn.bugstack.springframework.test.bean.UserService;

public class ApiTest {
    @Test
    public void test_Beanfactory(){
        //��ʼ�� beanfactory
        BeanFactory beanFactory = new BeanFactory();

        //ע��bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService",beanDefinition);

        //��ȡbean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
