package com.rk.cj.day9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5,5,6,7,8,9,};
        List<Integer> list = new ArrayList<>();

        for(int ele : arr){
            if(!list.contains(ele)){
                list.add(ele);
            }
        }
        System.out.println(list);
    }
}
