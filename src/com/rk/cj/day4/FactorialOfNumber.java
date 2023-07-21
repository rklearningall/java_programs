package com.rk.cj.day4;

public class FactorialOfNumber {
    public static void main(String[] args) {
         int n = 5;
         int res = 1;

         //for (int i = n; i>2; i--){
        //    res *= i;
         //}
        int i = n;
        while(i>=2) {
            res *= i;
            i--;
        }
         System.out.println("Factorial of number  is "  +res);
    }
}
