package com.rk.cj.day3;

import java.util.Scanner;

public class SumOfFirstNNaturalEvenAndOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter tne number ");
        int num = sc.nextInt();
        int sum =0;
        int even_sum = 0;
        int odd_sum =0;
        for(int i = 1; i <= num; i++) {
            sum += i;

            if (i % 2 == 0) {
                even_sum += i;
            }
            if (i % 2 != 0) {
                odd_sum += i;
            }
        }


        System.out.println("Sum of first " + num + " natural numbers is " + sum);
        System.out.println("Sum of first " + num + " even numbers is " + even_sum);
        System.out.println("Sum of first " + num + " odd numbers is " + odd_sum);
    }
}
