package com.rk.cj.day1;

import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double Sum = num1 +num2;
        double Average = Sum /2;

        System.out.println("The sum two numbers is "+Sum);
        System.out.println("Average of two number is "+Average);

    }

}
