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
        String vowels = "AEIOUYaieouy";

        //int length = word.length();

        // for (int i = 0; i <= length; i++)  { // I know this is a for loop. How to change to while?
        int i = 0;
        while (i < word.length()) {
            String c = String.valueOf(word.charAt(i));
            int x = vowels.indexOf(c);
            if (x >= 0) {
                System.out.println("The first vowel in " + word + " is " + c);
                return;
            }
            i++;
        }
        System.out.println("No vowels found in word.");

    }
}
