package com.rk.cj.day6;

import java.util.Scanner;

public class NoOfDaysInTheGivenMonthAndYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the moth number :");
        int month = sc.nextInt();
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        int noofdays = switch (month){
            case 1,3,5,7,8,10,12 -> 31;
            case 4,9,11 -> 30;
            case 2 -> {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    yield 29;
                } else {
                    yield 28;
                }
            }
            default -> -1;
        };
        System.out.println("No of days in the month " + numToMonth(month) + " and year " + year + " is " + noofdays);
    }
    public static String  numToMonth(int month){
        return switch (month) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month number";
        };
    }
}
