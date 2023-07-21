package com.rk.cj.day10;

class Account{
    int account_no;
    String name ;
    double balance;

    public Account(int account_no,String name,double balance){
        this.account_no = account_no;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount){
        if (amount > balance){
            System.out.println("Sorry! Insufficient funds");
        }else{
            balance -= amount;
            System.out.println("Amount " +amount+ " is debited from your account and your current balance is "+balance);
        }
    }

    public void deposit( double amount) {
        balance += amount;
        System.out.println("Amount "+amount+" is credited to your account and your current balance is "+balance);
    }
    public void showInfo(){
        System.out.println("Account Number "+account_no);
        System.out.println("Account hold Name "+name);
        System.out.println("Your Account  balance "+balance);
    }
}

public class ClassAndObjectExample {
    public static void main(String[] args) {
        Account acc1 = new Account(1001,"Rk",500000);
        Account acc2 = new Account(1003,"Rama  Krishna ",4560809);
        Account acc3 = new Account(1004,"sai P",345000);
        acc1.showInfo();
        acc1.withdraw(10000);
        acc1.showInfo();
        acc3.deposit(100000);
    }
}
