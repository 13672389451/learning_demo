package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    /**
     * ʹ��restful ģ���ѯ�û���Դ
     */

    @RequestMapping(value="/user",method = RequestMethod.GET)
    public String getAllUser(){
        System.out.println("��ѯ�����û���Ϣ");
        return "success";
    }

    @RequestMapping(value="/user/{1}",method = RequestMethod.GET)
    public String getUserByID(){
        System.out.println("����id��ѯ�����û���Ϣ");
        return "success";
    }

    @RequestMapping(value="/user",method = RequestMethod.POST)
    public String insertUser(String username ,String password){
        System.out.println("����û���Ϣ"+username);
        return "success";
    }



    @RequestMapping(value="/user",method = RequestMethod.PUT)
    public String updateUser(String username ,String password){
        System.out.println("�޸�"+username);
        return "success";
    }


}
