package com.kuang.dao;

import com.kuang.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    //����id ��ѯ�û�
    User queryUserById(@Param("id") int id);

    //�޸��û�
    void updateUser(User user);

}
