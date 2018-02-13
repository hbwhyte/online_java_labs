package objects_classes_methods.labs;

import java.math.BigDecimal;

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
        Flower rose = new Flower(2.5F, "red",12);
        Flower carnation = new Flower(1.2F,"pink",12);
        Ribbon satin = new Ribbon();

        float roseCost = (rose.getPrice() * rose.getAmount());
        float carnationCost = (carnation.getPrice() * carnation.getAmount());
        //Why does it say it costs 12.400001? (worse with double)
        // how to define sig digits?

        satin.color = "white";
        satin.style = "bow";

        System.out.println("A dozen " + rose.getColor() + " roses cost " + roseCost + " dollars, and are tied with a "
                + satin.color + " " + satin.style);
        System.out.println("A dozen " + carnation.getColor() + " carnations cost " + carnationCost + " dollars, and are " +
                "tied with a " + satin.color + " " + satin.style);

        System.out.println(rose.toString());
    }
}

// Second Class
class Flower {
    // instance variables
    private float price;
    private String color;
    private int amount;

    public Flower(float price, String color, int amount) {
        this.price = price;
        this.color = color;
        this.amount = amount;
    }

    public Flower() {}

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", amount=" + amount +
                '}';
    }
}

// Third Class
class Ribbon {
    String color;
    String style;

}

