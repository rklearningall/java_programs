package com.rk.cj.day11;

public class StringExample3 {
    public static void main(String[] args) {

        String name = "Core Java";
        System.out.println(name.length());
        System.out.println(name.charAt(2));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.contains("Java"));
        System.out.println(name.substring(0,2));
        System.out.println(name.substring(4));
        System.out.println(name.startsWith("Core"));
        System.out.println(name.endsWith("Core"));
        System.out.println(name.equalsIgnoreCase("core java"));
        System.out.println(name);
    }
}
