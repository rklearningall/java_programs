package com.rk.cj.day2;

import java.util.Scanner;

public class CalculationDiscountWithElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the bill amount : ");
        double billamount = scanner.nextDouble();

        double discount = 0;
        if (billamount >= 1000){
            discount = billamount * 0.1;
        }else {
            discount = billamount * 0.05;
        }
        double netamount = billamount - discount;
        System.out.println("Bill Amount : "+billamount);
        System.out.println("Discount : "+discount);
        System.out.println("netamount : " +netamount);
    }
}
