package com.rk.cj.day3;

import java.util.Scanner;

public class FactorialOfGivenNumber {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int num = Sc.nextInt();
        int fact = 1;
        for (int i = 2; i <= num; i++){
            fact *= i;
        }
        System.out.println("Factorial of number is "+fact);


    }
}
