package com.kuang.dao;

import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import sun.java2d.marlin.MarlinUtils;

import java.lang.management.MemoryUsage;

public class MyTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //sqlSession.getMapper(TeacherMapper.class)
    }

}
