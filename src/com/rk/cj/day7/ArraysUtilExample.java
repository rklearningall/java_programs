package com.rk.cj.day7;

import java.util.Arrays;

public class ArraysUtilExample {
    public static void main(String[] args) {

        int[] arr1 = new int[]{10,20,30,20,10};

        int[] arr2 = new int[arr1.length];

        for (int i = arr1.length -1, j = 0;i >= 0; i--, j++){
            arr2[j] = arr1[i];
        }
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Given the strings is palindrome");

        }else{
            System.out.println("Given the Strings is not palindrome");
        }
        int[] arr3 ={2,1,3,5,4};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

        char[] arr4 = {'a','c','d','b'};
        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr4));

        String name = "CoreJava";
        char[] arr5 = name.toCharArray();
        System.out.println(Arrays.toString(arr5));


        char[] arr6 = {'C', 'o', 'r', 'e', 'J', 'a', 'v', 'a'};
        if (Arrays.equals(arr5, arr6)) {
            System.out.println("Both are Equal");
        }else {
            System.out.println("Both are not equal ");
        }
    }

}
