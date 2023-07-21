package com.rk.cj.day9;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(100);
        list.add(30);
        list.add(40);
        list.add(60);
        list.add(50);
        list.add(5);
        list.add(80);
        int big = list.get(0);
        for (int  i=0; i< list.size(); i++){
            if(list.get(i) > big){
                big = list.get(i);
            }
        }
        System.out.println("biggest of element is "+big);
    }
}
