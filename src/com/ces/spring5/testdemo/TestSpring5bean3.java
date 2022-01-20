package com.ces.spring5.testdemo;

import com.ces.spring5.bean.Order;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5bean3 {

    @Test
    public void test(){
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Order order = context.getBean("orders", Order.class);
        System.out.println("第四步 获取创建bean实例对象");
        System.out.println(order);

        //手动让bean实例销毁
        context.close();
    }
}
