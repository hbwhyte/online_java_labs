package conditions_loops.labs;

import java.util.Scanner;
/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a word: ");
        String word = scanner.next();

        //int length = word.length();

        // for (int i = 0; i <= length; i++)  { // I know this is a for loop. How to change to while?
        int i = 0;
        while (i <= word.length()) {
            char vowel = word.charAt(i);
            // if (vowel == ('a' | 'e' | 'o' | 'i' | 'u'))
            if (vowel == ('a' | 'e')) {
                System.out.println("The first vowel in " + word + " is " + vowel);
                break;
            }
            i++;
        }
        // It freaks out if I have too many or statements on ln 22
        // "Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range:"

    }
}
