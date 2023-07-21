package com.rk.cj.day7;

import java.util.Arrays;

public class SearchExample {
    public static void main(String[] args) {
        int[] arr = getRandomArray(20);
        int key = 5;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = Arrays.binarySearch(arr,key);
        System.out.println(index);
        if(index >= 0){
            System.out.println("Given key "+key+ "is found at index :");
        }else{
            System.out.println("Give key "+key+ "is not found index :");
        }
    }

    public static int[] getRandomArray(int num){
        int[]arr  = new int[num];
        for(int i=0; i<arr.length; i++){
            arr[i] = (int) (Math.random() * 50);
        }
        return arr;
    }
}