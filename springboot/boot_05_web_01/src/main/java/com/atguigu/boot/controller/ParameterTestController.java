package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ParameterTestController {

@GetMapping("/car/{id}/owner/{username}")
    public Map<String,Object>getCar(@PathVariable("id") Integer id ,
                                    @PathVariable("username")String name,
                                    @PathVariable Map<String,String>pv,
                                    @RequestHeader("User-Agent") String userAgent,
                                    @RequestHeader Map<String,String> header,
                                    @RequestParam("age") Integer age,
                                    @RequestParam("inters") List<String> inters,
                                    @RequestParam Map<String,String> params
//                                   @CookieValue("uuid_tt_dd")String uuid_tt_dd,
//                                    @CookieValue("uuid_tt_dd") Cookie cookie

){

        HashMap<String, Object> map = new HashMap<>();

//        map.put("id",id);
//        map.put("name",name);
//        map.put("pv",pv);
//        map.put("userAgent",userAgent);
//        map.put("headers",header);

    map.put("age",age);
    map.put("inters",inters);
    map.put("params",params);
//    map.put("uuid_tt_dd",uuid_tt_dd);
//    System.out.println(cookie);

        return map;
    }

    @RequestMapping("/save")
    public Map postMethod(@RequestBody String content){
        HashMap<Object, Object> map = new HashMap<>();

        map.put("content",content);
        return map;

    }




}
