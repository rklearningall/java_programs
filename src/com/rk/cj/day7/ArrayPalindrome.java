package com.rk.cj.day7;

public class ArrayPalindrome {
    public static void main(String[] args) {

        int[] arr1 = new int[]{10,20,30,20,10};
        boolean flag = true;
        for(int i=0, j = arr1.length -1; i < j; i++, j--){
            if(arr1[i] != arr1[j]){
                flag =false;
                break;
            }
        }
        if(flag){
            System.out.println("Given the number is palindrome");
        }else{
            System.out.println("Given the number is not palindrome ");
        }

    }


}
