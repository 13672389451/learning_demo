package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
/*@RequestMapping("/hello")*/
public class RequestMappingController {

    @RequestMapping(
            value = "/test",
            params = {"username"}
    )
    public String success(){
        return "success";
    }


    @RequestMapping("/testPath/{id}")
    public String testPath(@PathVariable("id")Integer id){
        System.out.println(id);
        return "success";
    }






}
