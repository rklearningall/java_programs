package com.rk.cj.day2;

import java.util.Scanner;

public class BiggestOfThreeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int num1 =scanner.nextInt();
        System.out.println("Ether the second number : ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the three number : ");
        int num3 = scanner.nextInt();
        int big = 0;
        if ( num1 > num2 && num1 > num3){
            big = num1;
        }else if( num2 > num3){
            big = num2;
        }else{
            big = num3;
        }
        System.out.println("Biggest of "+num1+" , "+num2+" , "+num3+" is "+big);
    }
}
