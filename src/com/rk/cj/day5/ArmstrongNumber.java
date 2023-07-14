package com.rk.cj.day5;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 1;
        int num1 = num;
        int sum = 0;
        while(num1 != 0){
            int r = num1 % 10;
            sum =  sum +r * r * r;
            num1 /= 10;
        }
        if(num == sum)
        System.out.println("Give number "+num+"is Armstrong Number");
        else
            System.out.println("Give number " +num+ " is not Armstrong Number");
    }
}
