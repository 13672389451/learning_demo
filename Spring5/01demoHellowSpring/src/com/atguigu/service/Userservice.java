package com.atguigu.service;

import com.atguigu.dao.UserDao;

public class Userservice {

//����UserDao��������  ����set����
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service+++++add");
        userDao.update();
    }
}
