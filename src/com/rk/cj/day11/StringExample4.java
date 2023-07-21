package com.rk.cj.day11;

public class StringExample4 {
    public static void main(String[] args) {


        String name = "Learning ";
         int num = 2;
        for(int i = 0; i < name.length() - num+1; i++){
            System.out.println(name.substring(i,i+2));

        }
        String data = "Krish,Manoj,Ramesh,Suresh,Jayes,Allen,Akelesh";
        String[] names = data.split(",");
        for (String ele:names){
            if(ele.startsWith("J")){
                System.out.println(ele);
            }
        }


    }
}
