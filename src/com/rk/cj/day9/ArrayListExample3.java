package com.rk.cj.day9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample3 {
    public static void main(String[] args) {

        List<String > storelist1 = getproductsold("store1");
        List<String> storelist2 = getproductsold("store2");

        List<String> uniqueproduct = new ArrayList<>();
        for(String p : storelist1){
            if(!uniqueproduct.contains(p)) {
                uniqueproduct.add(p);
            }
        }
        for(String p : storelist2){
            if(!uniqueproduct.contains(p)){
                uniqueproduct.add(p);
            }
        }
        System.out.println(uniqueproduct);
    }
      

    private static List<String> getproductsold(String store){
        if (store.equals("store1")) {
            return List.of("P1", "P2", "P3", "P4", "P5");
        }else {
            return List.of("P1", "P3",  "P5", "P6", "P7");
        }
    }

}
