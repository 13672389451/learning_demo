package com.atguigu.test;

import com.atguigu.bean.Book;
import com.atguigu.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class testBook {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        BookService bookServce = context.getBean("bookService", BookService.class);

      //  Book book = new Book();
      // book.setUserId("110");
      //  book.setUsername("老铁");
      //  book.setUstatus("ss");

        //bookServce.addBook(book);

        //System.out.println(bookServce.findCount());

      //  Book one = bookServce.findOne("111");
       // System.out.println(one);

        //批量修改
        List<Object[]>batchArgs = new ArrayList<>();

        Object[] o1 = {"16622","110001","1"};
        Object[] o2 = {"666","8008","111"};
        Object[] o3 = {"666","8008","110"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        batchArgs.add(o3);
        bookServce.batchUpdate(batchArgs);


    }

}
