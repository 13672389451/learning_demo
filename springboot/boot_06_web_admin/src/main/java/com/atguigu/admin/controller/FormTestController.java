package com.atguigu.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

//文件上传
@Controller

public class FormTestController {

    @GetMapping("/form_layouts")
    public  String form_layouts(){
        return "form/form_layouts";
    }

@PostMapping("/upload")
    public String upload(@RequestParam("email") String email,
                         @RequestParam("username") String username,
                         @RequestPart("headerImg")MultipartFile headerImg,
                         @RequestPart("photos") MultipartFile []photos
                         ) throws IOException {
   if(!headerImg.isEmpty()){
       //保存文件
       String originalFilename = headerImg.getOriginalFilename();
       headerImg.transferTo(new File("H:\\cache\\"+originalFilename ));
   }

   if(photos.length > 0 ){
       for(MultipartFile photo : photos){
           if(!photo.isEmpty()){
               String originalFilename = headerImg.getOriginalFilename();
               photo.transferTo(new File("H:\\cache\\"+originalFilename));
           }
       }
   }



        return "main";

    }


}
