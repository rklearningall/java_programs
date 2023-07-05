package DAY1;

import java.util.Scanner;

public class personsweight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );

        System.out.println("enter the person 1: ");
        Double per1 = scanner.nextDouble();

        System.out.println("enter the person 2: ");
        Double per2 = scanner.nextDouble();

        System.out.println("enter the person 3: ");
        Double per3 = scanner.nextDouble();

        System.out.println("enter the person 4: ");
        Double per4 = scanner.nextDouble();

        System.out.println("enter the person 5: ");
        Double per5 = scanner.nextDouble();

        double Totalweight = per1+per2+per3+per4+per5;
        double Averageweight = Totalweight / 5;

        System.out.println("Net Weight is: " +Totalweight);
        System.out.println("The Average Weight is :"+Averageweight);

        scanner.close();



    }
}
