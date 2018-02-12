package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 2:
 *
 *      Create a class that demonstrates the following: (all methods below can be in the same class)
 *
 *      1) A static method that calls another static method.
 *      2) A static method that calls a non-static method.
 *      3) A non-static method1 that calls another non-static method2, but this time method2 should return a value to method1.
 *      4) A non-static method1 that calls another non-static method2 and passes a value to method2.
 */

class Exercise_02 {

    public static void main(String[] args) {
        // Static Calling Static
        Static2();
        // Static Calling Non Static
        Exercise_02 obj = new Exercise_02();
        obj.nonStatic1();
    }

    public static void Static2() {
        System.out.println("This is static2");
    }

    public void nonStatic1() {
        System.out.println("This is nonStatic1");
        // non static calling non static, and passing values to method 2
        nonStatic2(2,4);
        //I DON'T KNOW HOW TO DO #3

    }

    public int nonStatic2(int a, int b) {
        int sum = (a + b);
        return sum;
    }
}
