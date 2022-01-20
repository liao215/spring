package com.spring5.AOP.dao;


import com.spring5.AOP.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookDaoImpl extends BookDao {
    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book){
        //创建sql语句
        String sql = "insert into book values(?,?,?)";
        //调用方法实现
        Object[] args = {book.getId(),book.getName(),book.getCategory()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

    //修改的方法
    @Override
    public void updateBook(Book book){
        String sql = "update book set Name=?,Category=? where Id=?";
        Object[] args = {book.getName(),book.getCategory(),book.getId()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }
    //删除的方法
    @Override
    public void deleteBook(String id){
        String sql = "delete from book where Id=?";
        int update = jdbcTemplate.update(sql,id);
        System.out.println(update);
    }
    //批量添加
    @Override
    public void batchAddBook(List<Object[]> batchArgs){
        String sql = "insert into book value(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(Arrays.toString(ints));
    }
    //批量修改

    @Override
    public void batchUpdateBook(List<Object[]> batchArgs){
        String sql = "update book set Name=?,Category=? where Id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(Arrays.toString(ints));
    }

}
