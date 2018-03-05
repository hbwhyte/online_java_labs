package inheritance.labs.Exercise_01;

public class Beagle extends Dog {

    private boolean spots;
    private String name;
    private int legs;

    public Beagle(String name, int legs, boolean spots) {
        this.setName("Winston");
        this.setLegs(3);
        this.setSpots(true);
    }

    public boolean isSpots() {
        return spots;
    }

    public void setSpots(boolean spots) {
        this.spots = spots;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getLegs() {
        return legs;
    }

    @Override
    public void setLegs(int legs) {
        this.legs = legs;
    }
}



