package com.atguigu.test;

import com.atguigu.service.UserServce;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) //≈‰÷√≤‚ ‘øÚº‹
@ContextConfiguration("classpath:bean1.xml")//º”‘ÿ≈‰÷√Œƒº˛
public class JTest4 {

    @Autowired
    private UserServce userServce;



    @Test
    public void test(){
        userServce.add();
    }
}
