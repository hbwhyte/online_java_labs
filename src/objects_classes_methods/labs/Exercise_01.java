package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 1:
 *
 *      Create three classes, all of which can be inside this file. The first class (the controller)
 *      should have the main method. The main method should create at least two objects using the
 *      constructors of the second and third class. The second and third class should each have at least
 *      three instance variables that should be set using the constructor when an object is created.
 *
 *      Once the objects are created, try changing the values of some of the instance variables.
 *
 *      Think about some of the examples we have seen from the lectures or Confluence Docs.
 *
 *      Be creative. Have some fun. Using Java objects you can model just about anything you want.
 *      Cars, animals, poker games, sports teams, trees, beers, people and so on.
 */

// First Class
class Bouquet {
    // Main Method
    public static void main(String[] args) {
        // Create 2 objects with the constructors of the 2nd and 3rd class
        Flowers rose = new Flowers();
        Flowers carnation = new Flowers();
        Ribbon satin = new Ribbon();

        rose.price = 2.5F;
        rose.amount = 12;
        rose.color = "red";
        float roseCost = (rose.price * rose.amount);

        carnation.price = 1.20F;
        carnation.amount = 12;
        carnation.color = "pink";
        float carnationCost = (carnation.price * carnation.amount);
        //Why does it say it costs 12.400001? (worse with double)
        // how to define sig digits?

        satin.color = "white";
        satin.style = "bow";

        System.out.println("A dozen " + rose.color + " roses cost " + roseCost + " dollars, and are tied with a "
                + satin.color + " " + satin.style);
        System.out.println("A dozen " + carnation.color + " carnations cost " + carnationCost + " dollars, and are " +
                "tied with a " + satin.color + " " + satin.style);
    }
}

// Second Class
class Flowers {
    // instance variables
    float price;
    String color;
    int amount;
}

// Third Class
class Ribbon {
    String color;
    String style;

}

