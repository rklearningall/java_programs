package com.rk.cj.day2;

import java.util.Scanner;

public class BiggestOfTwoNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int num1 =scanner.nextInt();
        System.out.println("Ether the second number : ");
        int num2 = scanner.nextInt();
        int big = 0;
        if ( num1 > num2){
            big = num1;
        }else{
            big = num2;
        }
       System.out.println("Biggest of "+num1+" and "+num2+" is "+big);
    }
}
