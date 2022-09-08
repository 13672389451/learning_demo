package com.kuang.dao;

import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
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
        User user = userDao.getUserById(1);

        //��ɾ����Ҫ�ֶ��ύ����

        //����
        //userDao.addUser(new User(75,"����","15957"));

        //�޸��û�
        //userDao.updateUser(4,"bbb","1222");
       // userDao.updateUser(new User(4,"222","4444"));

        //ɾ���û�
        userDao.deleteUser(2);

        sqlSession.commit();

        System.out.println(user);

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



}
