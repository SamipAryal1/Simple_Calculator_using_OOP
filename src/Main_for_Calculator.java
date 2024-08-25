import models.Calculator;

import java.util.Scanner;

public class Main_for_Calculator {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a task (start, quit): ");
            String Task = scanner.nextLine().trim().toLowerCase();

            if (Task.equals("start")) {
                Calculator calc = new Calculator();

                System.out.print("Enter the first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter the second number: ");
                double num2 = scanner.nextDouble();


                System.out.println("Select an operation:");
                System.out.println("1: Addition");
                System.out.println("2: Subtraction");
                System.out.println("3: Multiplication");
                System.out.println("4: Division");
                System.out.print("Enter the operation number: ");
                int choice = scanner.nextInt();

                double result;
                if (choice == 1) {
                    result = calc.add(num1, num2);
                    System.out.println("Result of addition: " + result);

                } else if (choice == 2) {
                    result = calc.subtract(num1, num2);
                    System.out.println("Result of subtraction: " + result);

                } else if (choice == 3) {
                    result = calc.multiply(num1, num2);
                    System.out.println("Result of multiplication: " + result);

                } else if (choice == 4) {
                    result = calc.divide(num1, num2);
                    System.out.println("Result of division: " + result);
                } else {
                    System.out.println("Invalid operation selected.");
                }
            } else if (Task.equals("quit")) {
                System.out.println("Exiting the Calculator.");
                return;
            } else {
                System.out.println("Invalid Input.");
                scanner.close();
            }


        }
    }
}
