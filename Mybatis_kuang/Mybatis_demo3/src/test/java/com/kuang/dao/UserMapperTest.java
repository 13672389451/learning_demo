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
        //获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //getMapper
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> userList  = userDao.getUserList();

        for(User user : userList){
            System.out.println(user);
        }
        //根据ID 查询
        //User user = userDao.getUserById(1);

        sqlSession.commit();
        //关闭sqlsession
        sqlSession.close();
    }

    @Test
    public void testLike(){
        //获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> list = mapper.getUserLike("%老%");

        for(User user : list){
            System.out.println(user);
        }

    }

    @Test
    public void getUserByLimit(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        HashMap<String, Integer> stringIntegerHashMap = new HashMap<String, Integer>();
        stringIntegerHashMap.put("startIndex",0);
        stringIntegerHashMap.put("pageSize",2);

        List<User> userList = mapper.getUserByLimit(stringIntegerHashMap);

        for(User user : userList){
            System.out.println(user);
        }

        sqlSession.close();


    }

    @Test
    public void testbug(){
    //获取sqlsession对象
    SqlSession sqlSession = MybatisUtils.getSqlSession();

    UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        System.out.println(mapper);


        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex",0);
        map.put("pageSize",2);

        List<User> userList = mapper.getUserByLimit(map);

        for(User user : userList){
            System.out.println(user);
        }

        sqlSession.close();

}







}
