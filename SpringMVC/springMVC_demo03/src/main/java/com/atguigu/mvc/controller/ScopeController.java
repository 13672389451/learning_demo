package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class ScopeController {

    //使用servlet 向 request 域对象共享数据

    @RequestMapping(value = "testRequestByServletAPI")
    public String testRequestByServletAPI(HttpServletRequest request){
        request.setAttribute("test","Hello");
        return"success";
    }

    @RequestMapping(value = "testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView mav = new ModelAndView();

        //处理模型数据  向request 域共享数据
        mav.addObject("test","老六666");

        mav.setViewName("success");

        return mav;
    }

@RequestMapping(value = "testSession")
    public String testSession(HttpSession session){
        session.setAttribute("test","老胡");
        return "success";

    }
 @RequestMapping(value = "testApplication")
    public String testApplication(HttpSession session){
        ServletContext application = session.getServletContext();
        application.setAttribute("test","hello老铁");
        return "success";
    }



}
