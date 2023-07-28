package com.rk.cj.day13;

import static java.lang.Math.*;
import static java.lang.System.out;


public class StaticExample {

    public int sun (int a , int b ){
        return  a+b;
    }


     public  float sum (float a , float b){
        return a+b;
     }

     public float sum (float a , int b){
        return a+b;
     }

     public float sum (int a , float b){

         return a+b;
     }


     public int sum(int a , int b, int c){
        return a+b+c;
     }

     public int sum (int a , int b , int c, int d){
        return a+b+c+d;
     }

     public int sum(int[] args){
        int res = 0;
        for(int ele : args) {
            res += ele;
        }
        return res;
     }

     public int sum(float a , int b ,int[]  args){
        return 0;
     }




    public final static void main(final String[] args) {

        out.print(sqrt(3));
        out.println(pow(2,3));
        out.println((int)(random()*10+1));
        StaticExample obj = new StaticExample();
        out.println(obj.sum(1f ,2));
        out.println(obj.sum(1,345,89,9));
        out.println(obj.sum(1,4,5,6));
    }


}
