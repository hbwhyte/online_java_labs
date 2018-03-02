package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 4:
 *
 *      Demonstrate method overloading with at least three overloaded methods.
 *
 */
// Errors everywhere, does not run :(
class Overload {

    public static void printThing() {
        System.out.println();
    }

    public static void printThing(int x) {
        System.out.println(x);
    }

    public static void printThing(char x) {
        System.out.println(x);
    }

    public static void printThing(double x) {
        System.out.println(x);
    }

    public static void printThing(String x) {
        System.out.println(x);
    }

}

class OverloadTest {
    public static void main(String[] args) {

        Overload.printThing(10);
        Overload.printThing(1);
        Overload.printThing("string");
        Overload.printThing('c');
        Overload.printThing(134.2232);

        OverloadTest obj = new OverloadTest();

        obj.test();

        test3();

    }

    public void test() {
        System.out.println("test");

        test2();
    }

    public void test2() {
        System.out.println("test2");
    }

    public static void test3() {
        System.out.println("test3");
    }
}

