package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //��ѯ�����û�
    List<User> getUserList();

    //����ID��ѯ�û�
    User getUserById(Integer id);

    //�����û�
    int addUser(User user);

   //�޸��û�
    int updateUser(User user);

    //ɾ���û�
    void deleteUser(Integer id);

    //ģ����ѯ
    List<User>getUserLike(String value);

    //��ҳ
    List<User>getUserByLimit(Map<String,Integer> map);



}
