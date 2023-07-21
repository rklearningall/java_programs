package com.rk.cj.day6;

import java.util.Scanner;

public class CalculatorExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num 1");
        int num1 = sc.nextInt();
        System.out.println("Enter the num 2");
        int num2 = sc.nextInt();
        System.out.println("Enter the opertions (+,_,*,%,/): ");
        char ch = sc.next().charAt(0);
        switch (ch){
            case '+':
                System.out.println("Result is " +(num1 + num2));
                break;
            case '_':
                System.out.println("Result is " +(num1-num2));
                break;
            case '*':
                System.out.println("Result is  " +(num1 * num2));
                break;
            case '%':
                System.out.println("Result is " +(num1 % num2));
                break;
            case '/':
                System.out.println("result is " +(num1 / num2));
                break;
            default:
                System.out.println("Invalid operator ");
        }

    }
}
