package com.atguigu.service;

import com.atguigu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

public class UserServce {

    //注入dao
    @Autowired
    private UserDao userDao;

   //转账操作
    public void add(){

        //lucy 少
        userDao.reduceMoney();
 // int i = 10 / 0 ;
        userDao.addMoney();


    }
}
