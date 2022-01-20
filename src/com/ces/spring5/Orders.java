package com.ces.spring5;

public class Orders {
    //属性
    private String cname;
    private String address;
    //有参数构造
    public Orders(String cname, String address) {
        this.cname = cname;
        this.address = address;
    }
    public void ordersTest(){
        System.out.println(cname + ": " + address);
    }

}
