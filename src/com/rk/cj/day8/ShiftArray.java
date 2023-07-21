package com.rk.cj.day8;

import java.util.Arrays;

public class ShiftArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5,6};
        int n1 = 3;
        int[] shiftedArray = shift(arr1,n1);
        System.out.println(Arrays.toString(shiftedArray));

    }
public static int[] shift(int[] arr1,int n){
        int length = arr1.length;
        int[] shiftArray = new int[length];
        n = n % length;
        for ( int i = 0; i<length;i++){
            shiftArray[i] = arr1[(i + n) % length];
        }
return shiftArray;
}
}
