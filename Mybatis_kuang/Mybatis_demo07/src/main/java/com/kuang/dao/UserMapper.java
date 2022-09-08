package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    //根据id 查询用户
    User queryUserById(@Param("id") int id);

    //修改用户
    void updateUser(User user);

}
