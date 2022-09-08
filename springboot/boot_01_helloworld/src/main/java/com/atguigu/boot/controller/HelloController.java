package com.atguigu.boot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*@Controller
@ResponseBody*/

@Slf4j
@RestController
public class HelloController {


    @RequestMapping(value = "/hello")
    public String handle01(){
        return "Hello springboot";
    }
}
