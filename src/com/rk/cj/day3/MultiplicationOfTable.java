package com.rk.cj.day3;

import java.util.Scanner;

public class MultiplicationOfTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();

        for ( int i=1; i <=20;i++){
            System.out.println(num+"*"+i+"="+(num*i));
        }
    }
}
