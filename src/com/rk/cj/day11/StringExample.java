package com.rk.cj.day11;

public class StringExample {
    public static void main(String[] args) {
        String name1 = "Core Java";
        String name2 = "Core Java";


        String name3 = new String("Data type ");
        String name4 = new String("Data type");

        System.out.println(name1.equals(name2));
        System.out.println(name3.equals(name4) );

        int regno = 1001;
        String name = "Rama Krishna ";
        double Salary = 55000;
        String data = regno+ "," +name+ "," +Salary;
        System.out.println(data);


    }
}
