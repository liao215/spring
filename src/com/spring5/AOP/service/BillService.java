package com.spring5.AOP.service;

import com.spring5.AOP.dao.BillDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillService {

    //注入Dao
    @Autowired
    private BillDao billDao;

    //转账的方法
    public void accountMoney(){
        //less少100
        billDao.reduceMoney();
        //more多100
        billDao.addMoney();
    }
}
