package com.rk.cj.day4;

public class ContinueAndBreakExample {
    public static void main(String[] args) {

        int[] arr ={1,2,3,4,5,6,7,8,9,11,12,23};
        int key = 54;
        boolean flag = false;
        for(int ele:arr){
            if(ele == key){
                flag = true;
                break;

            }
        }
          if(flag){
              System.out.println("element are found ");
          }else{
              System.out.println("element are not found ");
          }

        for(int ele:arr) {
            if (ele == 5 || ele > 7) {
                continue;
            }
            System.out.println(ele + " ");

        }
    }
}
