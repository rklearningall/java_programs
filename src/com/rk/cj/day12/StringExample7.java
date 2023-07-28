package com.rk.cj.day12;

public class StringExample7 {
    public static void main(String[] args) {

        String empno = "MAt001";
        String name  = "Rama Krishna";
        String salary = "45000";
        String dept   = "HR ";



        StringBuilder sb = new StringBuilder(empno);
        sb.append(",").append(name).append(",").append(salary).append(",").append(dept);

        System.out.println(sb.toString());
    }
}
