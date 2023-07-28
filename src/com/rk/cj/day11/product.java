package com.rk.cj.day11;

public class product {

    private long pid;
    private String name;
    private double price;

    public product(long pid , String name , double price){
        this.pid = pid;
        this.name = name;
        this.price = price;
    }
    public void showInfo(){
        System.out.println("product id "+pid);
        System.out.println("product name "+name);
        System.out.println("product price "+price);

    }
}
