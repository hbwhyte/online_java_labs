package datatypes_operators.labs;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Data Types and Operators Exercise 3: Pig latin
 *
 *      Take in the user's name and print out their name translated to pig latin.
 *      For the purpose of this program, we will say that any word or name can be
 *      translated to pig latin by moving the first letter to the end, followed by "ay".
 *      For example: ryan -> yanray, caden -> adencay
 *
 *      HINT: We will make use of the substring() method.
 */

public class Exercise_03 {


    public static void main(String[] args) {
        // Collect Name
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();
        String base = name.substring(0,1);
        String tail = name.substring(1,name.length());
        String ay = "ay";
        String pigName = tail + base + ay;
        pigName = pigName.toLowerCase();

        // Print new name
        System.out.println("Your name in pig latin is " + pigName);



    }
}


