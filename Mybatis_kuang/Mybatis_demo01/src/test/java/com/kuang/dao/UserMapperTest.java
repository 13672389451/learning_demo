package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

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
        User user = userDao.getUserById(1);

        //增删改需要手动提交事物

        //插入
        //userDao.addUser(new User(75,"老六","15957"));

        //修改用户
        //userDao.updateUser(4,"bbb","1222");
       // userDao.updateUser(new User(4,"222","4444"));

        //删除用户
        userDao.deleteUser(2);

        sqlSession.commit();

        System.out.println(user);

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



}
