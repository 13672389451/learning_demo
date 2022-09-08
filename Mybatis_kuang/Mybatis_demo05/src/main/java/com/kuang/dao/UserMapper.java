package com.kuang.dao;
import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    List<User>getUsers();

    /*方法存在多个参数   需要加上 param */
    @Select("select * from user where id = #{id}")
    User getUserByID(@Param("id") int id);

    @Select("insert into user(id,name,pwd) values(#{id},#{name},#{password})")
    int addUser(User user);

    @Update("update user set name=#{name},pwd=#{password} where id=#{id}")
    int updateUser(User user);

    @Delete("delete from user where id =#{uid}")
    int deleteUser(@Param("uid") int id);

}
