package exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;

class Exercise_02 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the dividend: ");
            int a = scanner.nextInt();
            System.out.println("Please enter the divisor: ");
            int b = scanner.nextInt();
            int result = divide(a, b);
            if (result == -1) {
                System.out.print("");
            } else {
                System.out.println("The quotient is " + result);
            }
        } catch (InputMismatchException exc) {
            System.out.println("Input Mismatch Exception - please enter a valid number.");
        } catch (ArithmeticException exc) {
            System.out.println("Arithmetic exception - cannot divide by zero.");
        }
    }

    public static int divide(int a, int b) {
            int result = a / b;
            return result;
        }
}