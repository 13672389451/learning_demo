package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //����ID��ѯ�û�
    User getUserById(Integer id);

   //��ҳ
    List<User>getUserByLimit(Map<String,Integer> map);

}
