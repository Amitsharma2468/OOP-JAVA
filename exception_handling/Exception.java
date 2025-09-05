package exception_handling;

import java.util.Scanner;

public class Exception {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter num1: ");
                int num1 = input.nextInt();

                System.out.print("Enter num2: ");
                int num2 = input.nextInt();

                int result = num1 / num2;
                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println(e);
                System.out.println("Error: Division by zero is not allowed.");
            } catch (java.util.InputMismatchException e) {
                System.out.println(e);
                System.out.println("Error: Please enter valid integers.");
                input.nextLine(); // clear invalid input
            }
        }
    }
}
