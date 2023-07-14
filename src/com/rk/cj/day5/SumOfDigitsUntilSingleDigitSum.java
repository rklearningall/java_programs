package com.rk.cj.day5;

public class SumOfDigitsUntilSingleDigitSum  {
    public static void main(String[] args) {


        int num = 3895;
        int num1 = num;

        while (num > 9) {
            num = num % 10 + num / 10;
        }
        System.out.println("the sum of digits "  +num1+   "is "+num);
    }
}