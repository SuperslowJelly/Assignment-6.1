package io.github.superslowjelly.assignment61;

import java.util.Scanner;

public class Main {

    public static void ERROR() {
        System.out.println("Incorrect input, please try again!");
        calculator(); // Start again.
    }

    public static void calculator() {
        System.out.print("Please enter the desired operation (Multiplication, Division, Addition, or Subtraction): ");
        final Scanner SCANNER = new Scanner(System.in);
        String userChoice = SCANNER.nextLine();

        try {
            final Calculation OPERATION = Calculation.valueOf(userChoice.toUpperCase());

            System.out.print("Please enter your first operand: ");
            if (SCANNER.hasNextDouble()) OPERATION.setOperand1(SCANNER.nextDouble());
            else ERROR(); // User entered incorrect value for operand1.

            System.out.print("Please enter your second operand: ");
            if (SCANNER.hasNextDouble()) OPERATION.setOperand2(SCANNER.nextDouble());
            else ERROR(); // User entered incorrect value for operand2.

            System.out.println(OPERATION.calculate());

            System.exit(0); // Make sure the program stops once the final calculation is complete.

        } catch(IllegalArgumentException e) { // User entered incorrect value for OPERATION.
            ERROR();
        }
    }

    public static void main(String[] args) {
        calculator();
    }

}
