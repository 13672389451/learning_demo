package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

/*    @RequestMapping("/")
    public String index(){
        return "index";
    }*/

    @RequestMapping(value = "test_view")
    public String testView(){
        return "test_view";
    }



}
