package com.rk.cj.day11;

import java.util.Scanner;

public class StringExample5 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the String  ");
        String string = sc.nextLine();
        String rev = "";
        for(int i = string.length() - 1; i >= 0; i--){
            rev +=string.charAt(i);
        }
        if(rev.equals(string)){
            System.out.println("Give the String is palindrome ");
        }else {
            System.out.println("Give String is not  palindrome ");
        }
    }
}
