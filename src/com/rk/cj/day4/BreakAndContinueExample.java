package com.rk.cj.day4;

import java.util.Scanner;

public class BreakAndContinueExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        for (int i = 1; i <= 20; i++) {
            if (i % 4 == 0) {
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
