package com.rk.cj.day6;

import java.util.Scanner;

public class NumberOperation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         while(true){
             System.out.println("-".repeat(100));
             System.out.println("1.Check prime number ");
             System.out.println("2. Reverse the number ");
             System.out.println("3. Check palindorme number ");
             System.out.println("4 Sum of digits ");
             System.out.println("5 Exit ");
             System.out.println("-".repeat(100));
             System.out.println(" Enter the your choice");
             int choice = sc.nextInt();
             if(choice==5){
                 System.out.println("Thank you using app");
                 break;
             }
             System.out.println("Enter the number ");
             int num = sc.nextInt();

             switch (choice){
                 case 1:
                 if (MethodExample.isPrime(num)){
                     System.out.println("Give number "+num+ "is prime number ");
                 }else {
                     System.out.println("Given number "+num+ "is not prime number ");
                 }
                 break;
                 case 2:
                     System.out.println("Reverse of "+num+ "is "+MethodExample.reverse(num));
                     break;
                 case 3:
                     if(MethodExample.ispalindrome(num)) {
                         System.out.println("Give number " + num + "is palindrome number ");
                     }else{
                         System.out.println("Given number "+num+ "is not palindrome ");

                     }
                     break;
                 case 4:
                     System.out.println("sum of digits of "+num+ "is "+MethodExample.SumOfDigit(num));
                     break;
                 default:
                     System.out.println("Invalid choice");
             }
         }
    }
}
