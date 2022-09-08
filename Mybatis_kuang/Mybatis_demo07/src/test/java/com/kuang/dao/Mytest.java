package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class Mytest {

    @Test
    public void test01(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper);
       User user = mapper.queryUserById(1);
        System.out.println(user);







        User user2 = mapper.queryUserById(1);
        System.out.println(user2);

        System.out.println(user == user2);

    }

}
