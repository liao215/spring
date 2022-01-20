package com.spring5.AOP.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BillDaoImpl implements BillDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void reduceMoney() {
        String sql = "update bill set money=money-? where username=?";
        jdbcTemplate.update(sql,"100","less");
    }

    @Override
    public void addMoney() {
        String sql = "update bill set money=money+? where username=?";
        jdbcTemplate.update(sql,"100","more");
    }
}
