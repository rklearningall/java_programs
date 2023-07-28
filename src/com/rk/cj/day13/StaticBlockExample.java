package com.rk.cj.day13;


class Account{
    public static final String BANK_NAME = "SBI";
       static {
           System.out.println("This is static block of Account class");

       }
       public static void showInfo(){
           System.out.println("This is ShowInfo method");
       }
}

public class StaticBlockExample {
    static {
        System.out.println("This is static block of StaticBlockWithExample class");
    }

    public static void main(String[] args) {
        Account.showInfo();
        System.out.println("This is main");
        Account.showInfo();
    }
}
