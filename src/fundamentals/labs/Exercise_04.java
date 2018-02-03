package fundamentals.labs;

/**
 * Fundamentals Exercise 4: Area and Perimeter
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        float radius = 3.14F;
        int height = 5;
        double volume = Math.PI * radius * radius * height;
        double sArea = (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);

        System.out.println("The volume is " + volume);
        System.out.println("The surface area is " + sArea);
    }
}
