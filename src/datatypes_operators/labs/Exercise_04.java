package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 4: Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

import java.util.Scanner;

public class Exercise_04{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Please enter a number");
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        int average = sum / arr.length;

        System.out.println("The sum is " + sum + " and the average is " + average);
    }

}