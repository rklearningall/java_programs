package com.rk.cj.day11;

import java.util.List;

public class StringExample2 {

    public static void main(String[] args) {

        String name1 = "Hello World ";
        System.out.println(name1.length());
        System.out.println(name1.charAt(8));
        for(int i = 0; i<name1.length(); i++){
            System.out.println(name1.charAt(i));
        }

        String name = "Rama Krishna ";
        int count = 0;
        for (int i = 0; i < name.length(); i++){
            char ch = name.charAt(i);

            if(List.of('a','e','o','i','u','A','E','O','I','U').contains(ch)){
                count++;
            }
        }
        System.out.println("no of vowels in the String is "+count);

    }
}
