package com.rk.cj.day2;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("give number " + num + "is even");
        }else{
            System.out.println("Give number "+num+ "is odd");
        }
    }
}
