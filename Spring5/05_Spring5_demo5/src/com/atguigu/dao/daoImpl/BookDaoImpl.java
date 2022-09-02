package com.atguigu.dao.daoImpl;

import com.atguigu.bean.Book;
import com.atguigu.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {

    //注入 jdbctemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //添加方法
    @Override
    public void add(Book book) {
        //sql
        String sql = "insert into t_book values(?,?,?)";

        int update = jdbcTemplate.update(sql, book.getUserId(), book.getUsername(), book.getUstatus());
        System.out.println(update);


    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from t_book";

        return  jdbcTemplate.queryForObject(sql,Integer.class);
    }

    //查询返回对象
    @Override
    public Book findBookInfo(String id) {
      String sql = "select * from t_book where user_id=?";
      //Book book = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Book>(Book.class),id);
      Book book1=jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Book>(Book.class),id);
        return book1;
    }

    @Override
    public void batchUpdate(List<Object[]> batchArgs) {
        String sql ="update t_book set username=?,ustatus=? where user_id=?";
        int[]ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(Arrays.toString(ints));
    }


}
