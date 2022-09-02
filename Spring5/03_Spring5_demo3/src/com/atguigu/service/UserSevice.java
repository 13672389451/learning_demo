package com.atguigu.service;

import com.atguigu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Component(value = "userService")
@Service
public class UserSevice {
     @Value("aaa")
    private String name;
    //����dao��������
    //���ע������ע��
   // @Autowired  //��������ע��
    @Resource
    private UserDao userDao;


    public void add(){
        System.out.println("service add ......");
        userDao.add();
    }





}
