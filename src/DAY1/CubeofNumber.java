package DAY1;

import java.util.Scanner;

public class CubeofNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        double number = scanner.nextDouble();

        double cube = Math.pow(number,3);

        System.out.println("cube number is: "+cube);

        scanner.close();

    }
}
