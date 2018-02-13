package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 4:
 *
 *      Demonstrate method overloading with at least three overloaded methods.
 *
 */
// Errors everywhere, does not run :(
class overload {

    public static printThing() {
        System.out.println();
    }

    public static printThing(int x) {
        System.out.println(x);
    }

    public static printThing(char x) {
        System.out.println(x);
    }

    public static printThing(double x) {
        System.out.println(x);
    }

    public static printThing(String x) {
        System.out.println(x);
    }

} */

class overloadTest {
    public static void main(String[] args) {
        overload obj = new overload();


        obj.printThing(1);
        obj.printThing("string");
        obj.printThing('c');
        obj.printThing(134.2232);

    }
}

