package inheritance.labs.Exercise_01;

public class Dog extends Mammal {

    private boolean hypoallergenic;

    public Dog() {
    }

    public Dog (String name, int legs, boolean fur, boolean hypoallergenic) {
        this.setName("Dog");
        this.setFur(true);
        this.setLegs(4);
        this.hypoallergenic = hypoallergenic;
    }

    public boolean isHypoallergenic() {
        return hypoallergenic;
    }

    public void setHypoallergenic(boolean hypoallergenic) {
        this.hypoallergenic = hypoallergenic;
    }
}
