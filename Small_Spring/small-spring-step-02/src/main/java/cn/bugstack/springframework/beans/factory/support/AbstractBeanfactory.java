package main.java.cn.bugstack.springframework.beans.factory.support;

import main.java.BeansException;
import main.java.cn.bugstack.springframework.beans.factory.BeanFactory;
import main.java.cn.bugstack.springframework.beans.factory.config.BeanDefinition;

public abstract class AbstractBeanfactory extends DefaultSingletonBeanRegistry implements BeanFactory {


    @Override
    public Object getBean(String name) throws BeansException {

        Object bean = getSingleton(name);
        if(bean != null){
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return null;
    }
    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

}
