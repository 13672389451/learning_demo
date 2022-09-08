package com.atguigu.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan(basePackages = "com.atguigu.admin")
@SpringBootApplication
public class Boot06WebAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot06WebAdminApplication.class, args);
    }

}
