package main.java.cn.bugstack.springframework.beans.factory;

import main.java.BeansException;

public interface BeanFactory {
    public Object getBean(String name) throws BeansException;
}
