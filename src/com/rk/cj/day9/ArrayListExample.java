package com.rk.cj.day9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.add(1001);
        list.add(1003);
        list.add(1005);
        list.add(1011);
        list.set(1,1007);
        list.remove(2);
        list.set(2,1003);
        list.remove(2);
        list.add(1009);
        list.add(1,1001);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains(1001));
        System.out.println(list.indexOf(1001));
        System.out.println(list);



        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
         for(int ele : list ){
             System.out.println(ele);
        }


    }
}
