package exception_handling.labs;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */
// Doesn't work properly yet.
class Exercise_03 {
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
//        } catch (InputMismatchException exc) {
//            System.out.println("Input Mismatch Exception - please enter a valid number.");
        } catch (ArithmeticException exc) {
            System.out.println("Arithmetic Exception - cannot divide by zero.");
        } finally {
            System.out.println("Exception error. Sorry!");
        }
    }

    public static int divide(int a, int b) {
        int result = a / b;
        return result;
    }
}