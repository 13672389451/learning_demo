package com.atguigu.dao.UserDaoImpl;

import com.atguigu.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao add().....");
    }
}
