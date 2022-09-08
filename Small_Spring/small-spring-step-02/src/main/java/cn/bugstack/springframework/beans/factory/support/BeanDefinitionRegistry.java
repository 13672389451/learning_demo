package main.java.cn.bugstack.springframework.beans.factory.support;

import main.java.cn.bugstack.springframework.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
