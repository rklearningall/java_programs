package com.rk.cj.day11;

import java.util.ArrayList;
import java.util.List;

class Employees{

    long empno;
    String name;
    double Salary;

    public Employees(long empno,String name,double Salary){
        this.empno = empno;
        this.name = name;
        this.Salary = Salary;

    }

    public void shoInfo(){
        System.out.println("ID :" +empno);
        System.out.println("Name :" +name);
        System.out.println(" Saalay :" +Salary);

    }
}

public class StringExample6 {

    public static void main(String[] args) {
        String data = "1234,Manoj,45000-1235,Krish,56000-1236,Ramesh,67000-1237,Suresh,89000-1238,Jayesh, 45000-1239,Allen,45000";

        List<Employees> employeesList = new ArrayList<>();
        String[] arr = data.split("_" );
        for(String ele : arr){
            String[]  empArr = ele.split(",");
            long empno = Long.parseLong(empArr[0]);
            String name = empArr[1];
            double Salary = Double.parseDouble(empArr[2]);
            Employees emp = new Employees(empno,name,Salary);
            employeesList.add(emp);

        }
        System.out.println("Total employees :"+employeesList.size());
        for(Employees emp : employeesList){
            emp.shoInfo();
            System.out.println("---------------");
        }
    }

}
