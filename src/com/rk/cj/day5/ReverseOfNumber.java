package com.rk.cj.day5;

public class ReverseOfNumber {
    public static void main(String[] args) {
        int num = 365;
        int rev = 0;
        int num1 = num;

        while (num1 !=0){
            int r = num1 %10;
            rev = rev * 10 +r;
            num1 /=10;
       }
        System.out.println("Reverse of number " +num+"is "+rev);
    }
}
