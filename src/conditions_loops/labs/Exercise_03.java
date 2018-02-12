package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 3: Months of the year
 *
 *      Take in a number from the user and print "January", "February", ... "December", or "Other"
 *      if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 *
 */

public class Exercise_03 {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 12 inclusive: ");
        int month = scanner.nextInt();

        switch(month) {
            case 1:     System.out.println("January");
                break;
            case 2:     System.out.println("February");
                break;
            default:
                System.out.println("Other");
        }

    }

}
