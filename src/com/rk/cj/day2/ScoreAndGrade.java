package com.rk.cj.day2;

import java.util.Scanner;

public class ScoreAndGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the scores :");
        int score = scanner.nextInt();
        String grade = "";
        if( score >= 1 && score <= 5 ){
            grade = "C";
        }else if(score >= 6 && score <= 8 ){
            grade = "B";
        }else if (score >= 7 && score <=10){
            grade = "A";
        }else{
            grade = "Invalid Grade";
        }
        System.out.println("score   " +score);
        System.out.println("grade  " +grade);
    }
}
