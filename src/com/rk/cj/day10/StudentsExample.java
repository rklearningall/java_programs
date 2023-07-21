package com.rk.cj.day10;


import java.util.ArrayList;
import java.util.List;

class students{
    int rollno;
    String name ;
    int std;


   public students(int rollno ,String name, int std ){
       this.rollno = rollno;
       this.name = name;
       this.std = std;
   }

   public void showinfo(){
       System.out.println("Roll no " +rollno);
       System.out.println("Name " +name);
       System.out.println("Std "+std);
   }
   public void prommote(){
       this.std = this.std + 1;
   }
}
public class StudentsExample {
    public static void main(String[] args) {


        students s1 = new students(1001, "Rk", 8);
        students s2 = new students(1002, "sai ", 4);
        students s3 = new students(1003, "siva ", 9);
        students s4 = new students(1004, "Ramya ", 7);
        students s5 = new students(1005, "sai krishna ", 8);
        students s6 = new students(1006, "VL ", 9);
        students s7 = new students(1008, "rama ", 9);


        List<students> studentsList = new ArrayList<>(List.of(s1, s2, s3, s4, s5, s6, s7));
        for (students students : studentsList) {
            System.out.println("-".repeat(50));
            if (students.std == 9) {
                students.prommote();
            }
        }
        for (students students : studentsList){
            students.showinfo();
            System.out.println("-".repeat(50));
        }


    }
}
