package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //查询所有用户
    List<User> getUserList();

    //根据ID查询用户
    User getUserById(Integer id);

    //插入用户
    int addUser(User user);

   //修改用户
    int updateUser(User user);

    //删除用户
    void deleteUser(Integer id);

    //模糊查询
    List<User>getUserLike(String value);

    //分页
    List<User>getUserByLimit(Map<String,Integer> map);



}
