package com.atguigu.bean;

public class Orders {

    private String oname;

    public Orders() {
        System.out.println("1���޲ι���");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("2:����set����");
    }

    //��ʼ������
    public void initMethod(){
        System.out.println("3��ִ�г�ʼ������");
    }

    //��ʼ������
    public void destory(){
        System.out.println("5��ִ�г�ʼ������");
    }
}
