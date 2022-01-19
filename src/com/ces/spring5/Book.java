package com.ces.spring5;

public class Book {

    public String bname;
    public String bage;
    //set方法
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBage(String bage) {
        this.bage = bage;
    }

    public void testDemo(){
        System.out.println(bname + " " + bage);
    }

    //有参数构造
//    public Book(String bname) {
//        this.bname = bname;
//    }

//    public static void main(String[] args) {
//        Book book = new Book();
//        book.setBname("qwe");
////        Book book = new Book("qwe");
//    }

}
