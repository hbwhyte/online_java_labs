package datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 6: 2D Array
 *
 *      Create and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

//public class Exercise_06 {
//
//    public static void main(String[] args) {
//
//        int[][] twoDArray = new int[5][5];
//        int i = 0;
//        for (i = 0; i < 75; i += 3) {
//            int plusThree = i + 3;
//            if ((i % 5 == 0) && (i != 0)) {
//                System.out.println(plusThree + " ");
//            } else {
//                System.out.print(plusThree + " ");
//            }
//        }
//    }
//}

public class Exercise_06 {

    public static void main(String[] args) {

        int[][] twoDArray = new int[5][5];

        for (int row = 0; row < twoDArray.length; row++) {
            for (int col = 0; col < twoDArray[row].length; col++) {
                twoDArray[row][col] = ((row + 1) * (col +1) * 3);
                System.out.print(twoDArray[row][col] + " ");
            }
            System.out.println();
        }

    }
}
