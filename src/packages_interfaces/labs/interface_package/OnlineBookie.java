package packages_interfaces.labs.interface_package;

/**
 * Interfaces Exercise 1:
 *
 *      1) Write an interface with at least three methods. Write two classes that implement the
 *          interface in different ways.
 *      2) Write a class that extends one of the classes from the previous step. Overwrite the methods in
 *          the parent class.
 *
 *      NOTE: We encourage you to be creative and try to think of an example of your own for this
 *       exercise but if you are stuck, some ideas include:
 *
 *       - A Vehicle interface, that is extended by a Tractor class and a Scooter class. Two of the methods could be
 *          turnOn() and brake().
 *       - A PersonalDevice interface that is extended by a iPad class and a Computer class. Two of the methods could be
 *          playMusic() and turnOff().
 */



public interface OnlineBookie {
    String selectSport(String sport);
    String selectTeam(String team);
    int year (int year);
    boolean winningBet(boolean win);

}

class StanleyCup implements OnlineBookie {
    @Override
    public String selectSport(String sport){
        return sport = "Hockey";
    }
    @Override
    public String selectTeam(String team) {
        return team = "Edmonton Oilers";
    }

    @Override
    public int year (int year) {
        return year = 1990;
    }

    @Override
    public boolean winningBet(boolean win) {
        return win = true;
    }
}


class SuperBowl2018 implements OnlineBookie {

    @Override
    public String selectSport(String sport) {
        return sport = "American Football";
    }

    @Override
    public String selectTeam(String team) {
        return team = "New England Patriots";
    }

    @Override
    public int year (int year) {
        return year = 2018;
    }

    @Override
    public boolean winningBet(boolean win) {
        return win = false;
    }

}

class SuperBowl2017 extends SuperBowl2018 {
    @Override
    public int year (int year) {
        return year = 2017;
    }

    @Override
    public boolean winningBet(boolean win) {
        return win = true;
    }
}
