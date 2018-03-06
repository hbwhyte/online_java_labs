package exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

class Exercise_01 {
    public static void main(String[] args) {
        int result = divide(10,4);
        if (result == -1) {
            System.out.print("");
        } else {
            System.out.println("The quotient is " + result);
        }
    }

    public static int divide(int a, int b) {
        try {
            int result = a / b;
            return result;
        } catch (ArithmeticException exc) {
            System.out.println("Arithmetic exception - cannot divide by zero.");
            return -1;
        }

    }


}
