package com.atguigu.mvc.controller;

import com.atguigu.mvc.bean.User;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HttpController {

    @RequestMapping(value = "testRequestBody")
    public String testRequestBody(@RequestBody String requestBody){
        System.out.println("requestBody"+requestBody);
        return "success";
    }

    @RequestMapping(value = "/testEntity")
    public String testRequestEntity(RequestEntity<String> requestEntity){
        System.out.println(requestEntity.getHeaders());
        System.out.println(requestEntity.getBody());
        return"success";
    }

    @RequestMapping(value = "/testResponse")
    public void testResponse(HttpServletResponse response) throws IOException {

        response.getWriter().println("laoÁù");
    }

    @RequestMapping(value = "/testResponseBody")
    @ResponseBody
    public String testResponseBody(){
        return"success";
    }

    @RequestMapping(value = "/testResponseUser")
    @ResponseBody
    public User testResponseUser(){
        return new User(1002,"admin","11110",23,"Å®");
    }

    @RequestMapping(value = "/testAxios")
    @ResponseBody
    public String testAxio(String username,String password){
        System.out.println(username+""+password);
        return "hello,ÀÏÌú";
    }




}
