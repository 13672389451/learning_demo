package com.atgugu.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class JspController {

    @RequestMapping(value = "/success")
    public String success(){
        return "success";
    }
}
