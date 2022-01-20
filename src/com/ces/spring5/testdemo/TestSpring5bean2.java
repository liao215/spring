package com.ces.spring5.testdemo;

import com.ces.spring5.collectiontype.stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5bean2 {

    @Test
    public void testCollection(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        stu Stu = context.getBean("stu",stu.class);
        Stu.test();

    }
}
