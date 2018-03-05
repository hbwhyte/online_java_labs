package packages_interfaces.labs.interface_package;
import packages_interfaces.labs.package_package.PackageClass;

public class InterfaceClass {



    public static void main(String[] args) {
    PackageClass obj = new PackageClass();
    favouriteColour();
    // obj.favouriteColourPrivate(); will not run because it is protected
    obj.myNamePublic();

    }
    protected static void favouriteColour() {
        System.out.println("My favourite color is green.");
    }
    
}
