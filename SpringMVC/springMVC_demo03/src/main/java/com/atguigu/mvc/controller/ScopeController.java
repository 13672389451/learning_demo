package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class ScopeController {

    //ʹ��servlet �� request �����������

    @RequestMapping(value = "testRequestByServletAPI")
    public String testRequestByServletAPI(HttpServletRequest request){
        request.setAttribute("test","Hello");
        return"success";
    }

    @RequestMapping(value = "testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView mav = new ModelAndView();

        //����ģ������  ��request ��������
        mav.addObject("test","����666");

        mav.setViewName("success");

        return mav;
    }

@RequestMapping(value = "testSession")
    public String testSession(HttpSession session){
        session.setAttribute("test","�Ϻ�");
        return "success";

    }
 @RequestMapping(value = "testApplication")
    public String testApplication(HttpSession session){
        ServletContext application = session.getServletContext();
        application.setAttribute("test","hello����");
        return "success";
    }



}
