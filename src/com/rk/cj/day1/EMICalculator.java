package com.rk.cj.day1;

import java.util.Scanner;

public class EMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount : ");
        double amount = sc.nextDouble();
        System.out.println("Enter the month:  ");
        int month = sc.nextInt();
        System.out.println("enter the rate of interest :");
        double rateofinterest = sc.nextDouble();
        double r =rateofinterest;
        double emi = amount * r*Math.pow(1+r,month) / (Math.pow(1+r,month) - 1);
        double totalamount = emi * month;
        double interestamount = totalamount - amount;
        System.out.println("EMI"  +emi);
        System.out.println("month "+month);
        System.out.println("TotalAmount " +totalamount);
        System.out.println("Total interest " +interestamount);

    }
}
