package com.atguigu.service;

import com.atguigu.bean.Book;
import com.atguigu.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    //ע��dao
    @Autowired
    private BookDao bookDao;

    //��ӵķ���
    public void addBook(Book book){
        bookDao.add(book);
    }

    //��ѯ
    public int findCount(){
       return bookDao.selectCount();
    }

    //��ѯ
    public Book findOne(String id){
        return bookDao.findBookInfo(id);
    }


   //�����޸�
    public void batchUpdate(List<Object[]> batchArgs){
        bookDao.batchUpdate(batchArgs);
    }


}
