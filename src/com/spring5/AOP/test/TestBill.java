package com.spring5.AOP.test;

import com.spring5.AOP.service.BillService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBill {

    @Test
    public void TestAccount(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1AOP.xml");
        BillService billService = context.getBean("billService", BillService.class);
        billService.accountMoney();
    }
}
