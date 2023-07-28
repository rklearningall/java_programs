package com.rk.cj.day12;

import java.util.Arrays;
import java.util.List;

public class AnagramExample {
    public static void main(String[] args) {
         String str1 = "abc";
         String str2 = "cbre";
         System.out.println(isAnagaram(str1,str2));

    }
    private static List<String> possiblepalindromes(String str){
        return null;
    }
    private static boolean isAnagaram(String str1 , String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
