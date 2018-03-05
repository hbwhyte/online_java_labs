package inheritance.labs.Exercise_01;

public class Mammal {
    // This is the super class

    // At least two instance variables
    private String name;
    private int legs;
    private boolean fur;

    public Mammal () {
    }

    public Mammal (String name, int legs, boolean fur) {
        this.name = name;
        this.legs = legs;
        this.fur = fur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isFur() {
        return fur;
    }

    public void setFur(boolean fur) {
        this.fur = fur;
    }

}
