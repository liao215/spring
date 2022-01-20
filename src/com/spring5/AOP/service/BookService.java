package com.spring5.AOP.service;

import com.spring5.AOP.dao.BookDao;
import com.spring5.AOP.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    //注入Dao
    @Autowired
    private BookDao bookDao;

    //添加的方法
    public void addBook(Book book){
        bookDao.add(book);
    }
    //修改的方法
    public void updateBook(Book book){
        bookDao.updateBook(book);
    }
    //删除的方法
    public void deleteBook(String id){
        bookDao.deleteBook(id);
    }
    //批量添加
    public void batchAdd(List<Object[]> batchArgs){
        bookDao.batchAddBook(batchArgs);
    }
    //批量修改
    public void batchUpdate(List<Object[]> batchArgs){
        bookDao.batchUpdateBook(batchArgs);
    }
}
