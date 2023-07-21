package com.rk.cj.day6;

import java.util.Scanner;

public class BillCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bill Amount ");
        Double billAmount = sc.nextDouble();
        System.out.println("Entee the day number :");
        int day = sc.nextInt();

        double totalbillAmount = 0;
        switch (day){
            case 1,2,3:
                System.out.println("weekday you get 10% discount ");
                totalbillAmount = billAmount -(billAmount * 0.1);
                break;
            case 4,5:
                System.out.println("middays you get 20% discount ");
                totalbillAmount = billAmount - (billAmount * 0.2);
                break;
            case 6,7:
                System.out.println("weekend we will charges 30% extra :");
                totalbillAmount = billAmount +(billAmount *0.3);
                break;
            default:
                System.out.println("Enter the day is invalid number ");
                break;
        }
        System.out.println("\nyour billAmount " +billAmount+ "\nyour toatalbill with discount  is " +totalbillAmount);
    }
}
