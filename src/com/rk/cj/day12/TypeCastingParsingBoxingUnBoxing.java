package com.rk.cj.day12;

import java.util.ArrayList;
import java.util.List;

public class TypeCastingParsingBoxingUnBoxing {
    public static void main(String[] args) {

         int a = 10;
         float b = a;

         float c = 10.5f;
         int d = (int) c;

         String str = "100";
         int num = Integer.parseInt(str);

         String str1 = "100.55";
         float num1 = Float.parseFloat(str1);

         Integer ele = 100;
         int num2 = ele;
         System.out.println(Integer.toBinaryString(100));


        List<Integer> ints = new ArrayList<>();
    }
}
