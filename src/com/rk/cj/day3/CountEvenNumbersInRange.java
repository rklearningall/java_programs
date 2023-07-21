package com.rk.cj.day3;

import java.util.Scanner;

public class CountEvenNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lb :");
        int lb = sc.nextInt();
        System.out.println("Enter the ub  :");
        int ub = sc.nextInt();
        int count = 0;

        for (int i=lb; i<=ub; i++ ){
            if (i % 2 ==0){
                count++;
            }

        }
        System.out.println("Count of even numbers in the range "+lb+" and "+ub+" is "+count);

    }
}
