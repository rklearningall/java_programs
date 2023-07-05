package com.rk.cj.day1;

import java.util.Scanner;

public class Swapnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("before swap number");
        System.out.println("first number "+num1);
        System.out.println("second number " +num2);


        double temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swap number");
        System.out.println("first number "+num1);
        System.out.println("second number " +num2);

        scanner.close();

    }
}
