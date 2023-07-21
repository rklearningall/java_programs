package com.rk.cj.day7;

public class ArrayExample {
    public static void main(String[] args) {


        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println("Length of Array : "+arr.length);
        System.out.println("Elements of Array :"+arr[0]);
        System.out.println("Elements of array : "+arr[arr.length-1]);

        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("Reverse array :");

        for(int i=arr.length -1; i>=0; i--){
            System.out.println(arr[i]);

        }

    }


}
