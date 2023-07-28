package com.rk.cj.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringAssignment2Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(StringAssignment2Question.class.getResourceAsStream("/product.txt"));
        List<product> products = new ArrayList<>();
        while(sc.hasNext()){
            String line = sc.nextLine();
            String[] arr = line.split(",");
            long pid = Long.parseLong(arr[0]);
            String name = arr[1];
            double price = Double.parseDouble(arr[2]);
            product product = new product(pid, name, price);
            products.add(product);

        }
        for(product product: products){
            product.showInfo();
        }
    }
}
