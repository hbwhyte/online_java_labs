package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 5: More arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

import java.util.Scanner;

public class Exercise_05{

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer from 1-10: ");
        int input = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == input) {
                System.out.println("The index for " + input + " is " + i);
            } else {
                continue;
            }
        }



    }
}