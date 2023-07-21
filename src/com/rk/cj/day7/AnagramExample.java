package com.rk.cj.day7;

import java.util.Arrays;

public class AnagramExample {
    public static void main(String[] args) {

        String arr1 = "eat";
        String arr2 = "act";
        if(isAnagram(arr1,arr2)){
            System.out.println("Given string is Anagram :");
        }else{
            System.out.println("Given string is not Anagram :");
        }

    }

    public static boolean isAnagram(String arr1,String arr2){
        if(arr1.length() != arr2.length()){
            return false;
        }else {
            char[] str1  = arr1.toCharArray();
            char[] str2 = arr2.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
             return Arrays.equals(str1,str2);

        }
    }
}
