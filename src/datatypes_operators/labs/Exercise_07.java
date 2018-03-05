package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 7: Irregular Arrays
 *
 *      Create and populate an irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        int[][] irregularArr = {
                {0},
                {1, 2, 3, 5, 7},
                {4, 6, 8, 9},
        };

        for (int[] arr1 : irregularArr) {
            for (int item : arr1) {
                System.out.print(item + " ");
            }
            System.out.println();

        }
    }
}
