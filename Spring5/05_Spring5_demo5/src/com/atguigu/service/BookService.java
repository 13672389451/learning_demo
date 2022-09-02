package com.atguigu.service;

import com.atguigu.bean.Book;
import com.atguigu.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    //注入dao
    @Autowired
    private BookDao bookDao;

    //添加的方法
    public void addBook(Book book){
        bookDao.add(book);
    }

    //查询
    public int findCount(){
       return bookDao.selectCount();
    }

    //查询
    public Book findOne(String id){
        return bookDao.findBookInfo(id);
    }


   //批量修改
    public void batchUpdate(List<Object[]> batchArgs){
        bookDao.batchUpdate(batchArgs);
    }


}
