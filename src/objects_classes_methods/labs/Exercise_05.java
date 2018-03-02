package objects_classes_methods.labs;

/**
 * Objects, Classes and Methods Exercise 5:
 *
 *      Demonstrate the use of static instance variables. Create a class with at least one static variable
 *      and one non-static variable. Create a few objects of that class and set the values of the variables.
 *      Use System.out.println to demonstrate when the variables are changed.
 *
 */

class Controller {

    public static void main(String[] args) {

        Countries canada = new Countries();
        canada.setCapitalCity("Ottawa");
        canada.setLanguage("English and French");

        System.out.println("In " + canada.getCapitalCity() + " they speak " + canada.getLanguage());

        Countries spain = new Countries();
        spain.setCapitalCity("Madrid");
        spain.setLanguage("Spanish");

        System.out.println("In " + spain.getCapitalCity() + " they speak " + spain.getLanguage());

        Countries germany = new Countries();
        germany.setCapitalCity("Berlin");
        germany.setLanguage("German");

        System.out.println("In " + germany.getCapitalCity() + " they speak " + germany.getLanguage());


        System.out.println(Countries.numCountries);

    }
}

class Countries {
    private String capitalCity;
    private String language;
    public static int numCountries = 0;

    public Countries() {
        numCountries++;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}