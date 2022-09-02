package com.atguigu.dao;

import com.atguigu.bean.Book;

import java.util.List;

public interface BookDao {

    void add(Book book);

    int selectCount();

    Book findBookInfo(String id);
//�����޸�
    void batchUpdate(List<Object[]> batchArgs);
}
