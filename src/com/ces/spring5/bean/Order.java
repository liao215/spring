package com.ces.spring5.bean;

public class Order {

    //无参数的构造
    public Order(){
        System.out.println("第一步 执行无参数的构造创建bean实例");
    }

    private String cname;
    public void setCname(String cname){
        this.cname = cname;
        System.out.println("第二步 调用set方法设置属性值");
    }

    //创建执行的初始化的方法
    public void init(){
        System.out.println("第三步 执行初始化的方法");
    }

    //创建执行的销毁方法
    public void destory(){
        System.out.println("第五步 执行销毁方法");
    }

}
