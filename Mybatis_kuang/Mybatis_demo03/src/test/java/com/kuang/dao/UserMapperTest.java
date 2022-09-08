package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;


import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

public class UserMapperTest {

    @Test
    public void test(){
        //��ȡsqlsession����
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //getMapper
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        //����ID ��ѯ
        User user = userDao.getUserById(1);

        sqlSession.commit();
        //�ر�sqlsession
        sqlSession.close();
    }

    @Test
    public void testLike(){
/*        //��ȡsqlsession����
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> list = mapper.getUserLike("%��%");

        for(User user : list){
            System.out.println(user);
        }*/

    }


   @Test
    public void testLimit(){

       SqlSession sqlSession = MybatisUtils.getSqlSession();

       UserMapper mapper = sqlSession.getMapper(UserMapper.class);

       HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
       stringIntegerHashMap.put("startIndex",0);
       stringIntegerHashMap.put("pageSize",2);

       List<User> userList = mapper.getUserByLimit(stringIntegerHashMap);

       for(User user : userList){
           System.out.println(user);
       }

       sqlSession.close();


   }


}
