package com.rk.cj.day9;

public class PatternsExample {
    public static void main(String[] args) {

        int[][] arr = new int[][]{
                {1, 1, 1, 1, 0, 0,0},
                {0, 0, 0, 1, 0, 0,0},
                {0, 0, 0, 1, 0, 0,0},
                {0, 0, 0, 1, 0, 0,0},
                {0, 0, 0, 1, 1, 1,0},
                {1, 0, 0, 0, 0, 0,1},
                {1, 0, 0, 0, 0, 0,1},
                {1, 0, 0, 0, 0, 0,1},
                {1, 0, 0, 0, 0, 0,1}

        };
        for (int[] ints : arr){
            for (int anInt : ints){
                if (anInt == 1){
                    System.out.print(" @ ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
