package com.spring5.AOP.test;

import com.spring5.AOP.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestBook {

    @Test
    public void testJdbcTemplate(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1AOP.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        //添加
//        Book book = new Book();
//        book.setId(7);
//        book.setName("java");
//        book.setCategory("java");
//        bookService.addBook(book);

        //修改
//        Book book = new Book();
//        book.setId(7);
//        book.setName("python");
//        book.setCategory("课程");
//        bookService.updateBook(book);

        //删除
//        bookService.deleteBook("7");

//        //批量添加
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"2","python","py"};
//        Object[] o2 = {"3","C++","c"};
//        Object[] o3 = {"4","html5","h5"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        //调用批量添加
//        bookService.batchAdd(batchArgs);

        //批量修改
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"python01","py01","2"};
        Object[] o2 = {"C++02","c01","3"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        //调用批量添加
        bookService.batchUpdate(batchArgs);
    }
}
