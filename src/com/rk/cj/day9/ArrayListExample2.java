package com.rk.cj.day9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {
    public static void main(String[] args) {

        List<String > namelist1 = new ArrayList<>();
        namelist1.add("krishna");
        namelist1.add("rama ");

        List<String> nameslist2 = new ArrayList<>();
        nameslist2.add("siva");
        nameslist2.add("sai ");
        nameslist2.add("VL");

        List<String> namelist3 = new ArrayList<>();
        namelist3.add("RK ");
        namelist3.add("UVL");

        List<String> allnames = new ArrayList<>();
        allnames.addAll(namelist1);
        allnames.addAll(nameslist2);
        allnames.addAll(namelist3);


        System.out.println(namelist3);
        System.out.println(namelist3.containsAll(nameslist2));
        System.out.println(namelist3.containsAll(namelist1));
        System.out.println("Combined of all name "+allnames);

    }
}
