package com.atguigu.service;

import com.atguigu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

public class UserServce {

    //ע��dao
    @Autowired
    private UserDao userDao;

   //ת�˲���
    public void add(){

        //lucy ��
        userDao.reduceMoney();
 // int i = 10 / 0 ;
        userDao.addMoney();


    }
}
