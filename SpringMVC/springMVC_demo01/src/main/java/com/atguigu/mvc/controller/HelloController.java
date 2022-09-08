package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HelloController {


    @RequestMapping(value = "/")
    public String index(){
        //∑µªÿ ”Õº√˚≥∆
        return "index";
    }

    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }


}
