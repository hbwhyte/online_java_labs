package inheritance.labs.Exercise_01;

public class Controller {
    public static void main(String[] args) {
        Dog dusty = new Dog("Dusty",3,true,false);
        System.out.println("The dog's name is " + dusty.getName() + " and he has " + dusty.getLegs() + " legs.");

        Beagle winston = new Beagle("Winston", 3,true);
        System.out.println("The beagle's name is " + winston.getName() + " and he has " + winston.getLegs() + " legs.");

        }
    }

