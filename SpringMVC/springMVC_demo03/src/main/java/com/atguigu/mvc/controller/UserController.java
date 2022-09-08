package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    /**
     * 使用restful 模拟查询用户资源
     */

    @RequestMapping(value="/user",method = RequestMethod.GET)
    public String getAllUser(){
        System.out.println("查询所有用户信息");
        return "success";
    }

    @RequestMapping(value="/user/{1}",method = RequestMethod.GET)
    public String getUserByID(){
        System.out.println("根据id查询所有用户信息");
        return "success";
    }

    @RequestMapping(value="/user",method = RequestMethod.POST)
    public String insertUser(String username ,String password){
        System.out.println("添加用户信息"+username);
        return "success";
    }



    @RequestMapping(value="/user",method = RequestMethod.PUT)
    public String updateUser(String username ,String password){
        System.out.println("修改"+username);
        return "success";
    }


}
