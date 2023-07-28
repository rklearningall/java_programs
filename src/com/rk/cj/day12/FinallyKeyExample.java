package com.rk.cj.day12;

import java.util.Arrays;

final class C1{
       public void m1(){
           System.out.println("M1 method");
       }
}
class C2{
    public  void m1() {
        System.out.println("This is m1 method from C2 class and override from C1 class");

    }
}



public class FinallyKeyExample {
    public static void main(final String[] args) {
        final int No_Of_Days_In_Week = 7;
        System.out.println(args.length+" "+Arrays.toString(args));
        args[0] = "Rk";
        System.out.println(args.length+" "+Arrays.toString(args));

    }
}
