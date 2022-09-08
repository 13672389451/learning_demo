package com.atguigu.admin.controller;

import com.atguigu.admin.bean.Account;
import com.atguigu.admin.bean.City;
import com.atguigu.admin.bean.User;
import com.atguigu.admin.service.AccountService;
import com.atguigu.admin.service.CityService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

@Slf4j
@Controller
public class IndexController {


    @Autowired
    JdbcTemplate jdbcTemplate;

    @Autowired
    AccountService accountService;

    @Autowired
    CityService cityService;


    @ResponseBody
    @GetMapping("/city")
    public City getCityById(@RequestParam("id") Long id){
        return cityService.getById(id);
    }


    @ResponseBody
    @GetMapping("/acct")
    public Account getById(@RequestPart("id") Long id){
        return accountService.getAcctByid(id);
    }



    @GetMapping(value = {"/","/login"})
    public String loginPage(){
        return "login";
    }


    @PostMapping("/login")
    public String main(User user, HttpSession httpSession, Model model){

        if(!StringUtils.isEmpty(user.getUserName()) && !StringUtils.isEmpty(user.getPassword())){
            //要把登录成功的用户保存起来
            httpSession.setAttribute("loginUser",user);
            //登录成功 重定向到main.html  防止表单重复提交
            return "redirect:/main.html";
        }else{
            //回到登录页面
            return "login";
        }


    }

    @GetMapping("/main.html")
    public String mainPage(HttpSession session,Model model){

    //是否登录  拦截器
        Object loginUser = session.getAttribute("loginUser");
        if(loginUser != null){
            return "main";
        }else{
            //回到登录页面
            model.addAttribute("msg","error");
            return "login";
        }

    }



}
