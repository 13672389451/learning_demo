package com.atguigu.mvc.controller;

import com.atguigu.mvc.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class ParamController {

@RequestMapping("/testServletAPI")
    //形参位置的request 表示当前请求
    public String testServletAPI(HttpServletRequest request){
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    System.out.println(username);
    return "success";
}


@RequestMapping("/testParam")
    public String testParam(String username , String password){
    System.out.println(username);
    return "success";
}

@RequestMapping("/testBean")
    public String testBean(User user){

    
    System.out.println(user);
    return "success";
}


}

