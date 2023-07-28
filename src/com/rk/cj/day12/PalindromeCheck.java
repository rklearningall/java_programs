package com.rk.cj.day12;

public class PalindromeCheck {
    public static void main(String[] args) {



        String str = "madam";
        String rev = new StringBuilder(str).reverse().toString();
        if(str.equals(rev)){
            System.out.println("Given the String palindrome: ");
        }else{
            System.out.println("Given the String is not palindrome");
        }
    }
}
