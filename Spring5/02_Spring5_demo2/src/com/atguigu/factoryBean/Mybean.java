package com.atguigu.factoryBean;

import org.hamcrest.Factory;
import org.springframework.beans.factory.FactoryBean;

public class Mybean implements FactoryBean  {


    @Override
    public Object getObject() throws Exception {

        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
