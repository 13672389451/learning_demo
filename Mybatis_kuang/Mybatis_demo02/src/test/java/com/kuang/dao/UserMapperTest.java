package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

public class UserMapperTest {

    static Logger logger = Logger.getLogger(String.valueOf(UserMapperTest.class));

    @Test
    public void test(){
        //��ȡsqlsession����
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //getMapper
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> userList  = userDao.getUserList();

        for(User user : userList){
            System.out.println(user);
        }
        //����ID ��ѯ
        //User user = userDao.getUserById(1);

        sqlSession.commit();
        //�ر�sqlsession
        sqlSession.close();
    }

    @Test
    public void testLike(){
        //��ȡsqlsession����
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> list = mapper.getUserLike("%��%");

        for(User user : list){
            System.out.println(user);
        }

    }

    @Test
    public void testLimit(){
        //��ȡsqlsession����
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        System.out.println(mapper);

        HashMap<String, Integer> map = new HashMap<>();
        map.put("startIndex",2);
        map.put("pageSize",2);

     List<User>list =   mapper.getUserByLimit(map);

        for(User user : list){
            System.out.println(user);
        }



        //�ر�sqlsession
        sqlSession.close();

    }





}
