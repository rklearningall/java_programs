package com.rk.cj.day4;

import java.util.Scanner;

public class SumOfDigitsOfGiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int num  = sc.nextInt();
        int num1 = num;
        int sum = 0;
        while(num1 != 0){
            int r = num1 % 10;
            sum += r;
            num1 /= 10;
        }
        System.out.println("sum of  digit of  give number is "+sum);
    }
}
