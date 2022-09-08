package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewTestController {

    @GetMapping("/atguigu")
    public String atguigu(Model model){
        //model中的数据回被放在请求域中
        model.addAttribute("msg","hello");
        model.addAttribute("link","http://www.baidu.com");

        return "success";
    }

}
