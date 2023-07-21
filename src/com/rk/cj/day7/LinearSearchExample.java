package com.rk.cj.day7;

public class LinearSearchExample {
    public static void main(String[] args) {
        int[] arr = {10, 40, 50, 45, 20};
        int key = 80;
        int index = linearSearch(arr, key);
        if (index == -1) {
            System.out.println("Given key  " + key +   "is not found in array");
        } else {
            System.out.println("Given key  "  + key +   "is found at  :" + index);
        }
    }
        private static int linearSearch(int[] arr,int key){
         for (int i = 0; i< arr.length; i++){
             if(arr[i] == key){
                 return i;
             }
         }
         return -1;
    }
}