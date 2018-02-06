package conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.println("Provide a number from 1 to 7 inclusive: ");
        // assign input to variable as int
        int day = scanner.nextInt();

        // write completed code here
        if(day == 1) System.out.println("Monday");
        else if(day == 2) System.out.println("Tuesday");
        else if(day == 3) System.out.println("Wednesday");
        else if(day == 4) System.out.println("Thursday");
        else if(day == 5) System.out.println("Friday");
        else if(day == 6) System.out.println("Saturday");
        else if(day == 7) System.out.println("Sunday");
        else System.out.println("Other");
    }
}
