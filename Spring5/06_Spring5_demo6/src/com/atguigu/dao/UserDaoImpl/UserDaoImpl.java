package com.atguigu.dao.UserDaoImpl;

import com.atguigu.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    //×¢Èëjdbctemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney() {
        String sql = "update t_account set money=money+? where username=?";
        jdbcTemplate.update(sql,100,"mary");
    }

    //ÉÙÇ®
    @Override
    public void reduceMoney() {
    String sql = "update t_account set money=money-? where username=?";
    jdbcTemplate.update(sql,100,"lucy");
    }
}
