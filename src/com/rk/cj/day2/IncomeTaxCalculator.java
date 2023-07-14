package com.rk.cj.day2;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double taxAmount = 0, totalIncome;
        System.out.println("Enter the income : ");
        Double  totalincome = scanner.nextDouble();

        if(totalincome <= 300000){
            taxAmount = 0;
        }else if (totalincome <= 500000){
            taxAmount = 0.1 * (totalincome - 300000);
        }else if (totalincome <=1000000){
            taxAmount = 0.2 *(totalincome - 500000) + (0.1 * 200000);
        }else {
            taxAmount = (0.3 * (totalincome - 1000000)) + (0.2 * 500000) +(0.1 * 100000);
        }
        System.out.println("For income " + totalincome + " tax is " + taxAmount + " and net income is " + (totalincome - taxAmount));

    }
}
