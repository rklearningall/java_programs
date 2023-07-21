package com.rk.cj.day8;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,5,50,60,70};
        int big = biggest(arr);
        int small = smallest(arr);
        int res = sum(arr);
        float avgres = average(arr);
        int[] arr1 = new int[]{1,2,3,4,5,6};
        System.out.println("biggest of the elements " +big);
        System.out.println("smallest of the elements "+small);
        System.out.println("sum of elements "+res);
        System.out.println("Average of the elements "+avgres);


    }

    public static int  biggest(int[] arr){
        int big = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(big < arr[i]){
                big = arr[i];
            }
        }
        return big;
    }
    public static int smallest(int[] arr){
        int small = arr[0];
        for (int i = 1; i<arr.length;i++){
            if (small >arr[i]){
                small = arr[i];
            }
        }
        return small;
    }

    public static int sum (int[] arr){
        int res = 0;
        for (int ele : arr){
        res += ele;
        }
        return res;
    }

    public static float average(int[] arr){
        return sum(arr) / (float)arr.length;
    }

   public static  int[] shift(int[] arr,int n ){
        int[] arr1 = new int[]{1,2,3,4,5,6};
        int shift = 0;
         n =3;
        int[] shiftArray1 = shift(arr1,n);
        return arr1;
   }
}
