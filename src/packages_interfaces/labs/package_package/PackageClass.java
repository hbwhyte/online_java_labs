package packages_interfaces.labs.package_package;

public class PackageClass {

    public static void main(String[] args) {
        myNamePublic();
        favouriteColourProtected();
    }

    public static void myNamePublic() {
        System.out.println("My name is Heather.");
    }

    protected static void favouriteColourProtected() {
        System.out.println("My favourite color is red.");

    }


}
