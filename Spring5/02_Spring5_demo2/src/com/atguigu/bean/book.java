package com.atguigu.bean;

import org.springframework.beans.factory.config.ListFactoryBean;

import java.util.List;

public class book {

    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }
    public void test(){
        System.out.println(list);
    }

}
