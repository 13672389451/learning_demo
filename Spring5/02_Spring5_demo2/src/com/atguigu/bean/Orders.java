package com.atguigu.bean;

public class Orders {

    private String oname;

    public Orders() {
        System.out.println("1：无参构造");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("2:调用set方法");
    }

    //初始化方法
    public void initMethod(){
        System.out.println("3：执行初始化方法");
    }

    //初始化方法
    public void destory(){
        System.out.println("5：执行初始化方法");
    }
}
