package com.rk.cj.day10;

import java.util.ArrayList;
import java.util.List;

class Employes{
    int emp_no;
    String emp_name;
    double Salary;

    public Employes(int emp_no,String emp_name,double Salary){
        this.emp_name = emp_name;
        this.emp_no = emp_no;
        this.Salary = Salary;
    }

    public double getsalary(){
      return  Salary;
    }


    public void setSalary(double Salary){
        this.Salary = Salary;
    }

    public  void showInfo() {

        System.out.println("Employee NUmber " +emp_no);
        System.out.println("Employee Name " + emp_name);
        System.out.println("Employee  Salary " + Salary);
    }
}


public class EmployesExample {
    public static void main(String[] args) {

        Employes emp1 = new Employes(1000, "Rama ",65000);
        Employes emp2 = new Employes(1001, "Rama Krishna ",7500);
        Employes emp3 = new Employes(1002, "Sai Krishna ",64598);
        Employes emp4 = new Employes(1003, "Siva",68786);
        Employes emp6 = new Employes(1004, "Sai",62341);
        Employes emp7= new Employes(1005 , "RK",68000);
        Employes emp8 = new Employes(1006, "Sai Charan",64532);
        Employes emp9 = new Employes(1007, "Ramya",69873);
        Employes emp10 = new Employes(1008, "Krishna",65000);
        Employes emp11= new Employes(1009, "VL",65986);

        List<Employes> employesList = new ArrayList<>(List.of(emp1,emp2,emp3,emp4,emp6,emp7,emp8,emp9,emp10,emp11));
            double TotalSalary = 0;
            for( Employes employes :employesList){
                //Display the all employee details by calling showInfo method

                // employes.showInfo();


                // Display the employee details whose salary is greater than 50000

                //filter(employee -> employee.getSalary() > 50000)
                  //  employes.showInfo();
                    //System.out.println("-".repeat(50));
                //}

                TotalSalary += employes.getsalary();


               //  double newSalary = employes.getsalary() * 1.10;
                //employes.setSalary(newSalary);
            //}

            //for (Employes employes : employesList){
              //  employes.showInfo();
              //  System.out.println("-".repeat(50));


            }

        System.out.println("Total Salary  of All Employees  " +TotalSalary);

    }
}
