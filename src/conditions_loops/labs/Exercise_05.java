package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an upper bound:");
        int upper = scanner.nextInt();
        System.out.println("Enter a lower bound");
        int lower = scanner.nextInt();

        // Calculate the sum
        int sum = 0;
        for (int i = lower; i <= upper; i++ ) {
            sum = sum + i;
        }

        // Calculate the average - cast to Float
        float average = (float) (upper + lower) / 2;

        // Print the results
        System.out.println("Their sum is " + sum);
        System.out.println("Their average is " + average);
    }
}
