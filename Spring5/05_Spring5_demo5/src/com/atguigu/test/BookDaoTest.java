package com.atguigu.test;

import com.atguigu.dao.BookDao;
import com.atguigu.dao.daoImpl.BookDaoImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class BookDaoTest {

    @Test
    public void findBookInfo() {
        BookDao bookDao = new BookDaoImpl();
        bookDao.findBookInfo("1");
    }

    @Test
    public void selectCount() {
        BookDao bookDao = new BookDaoImpl();
        System.out.println( bookDao.selectCount());
    }
}