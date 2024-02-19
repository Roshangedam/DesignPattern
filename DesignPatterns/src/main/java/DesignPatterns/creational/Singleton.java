package DesignPatterns.creational;
/**
 * The `SingleObject` class represents a singleton pattern implementation,
 * ensuring that only one instance of the class can be created.
 */
class SingleObject {

    private static SingleObject obj;

    // Private constructor to prevent direct instantiation
    private SingleObject() {}

    static SingleObject getTestObject() {
        if(obj == null)
            obj = new SingleObject();
        return obj;
    }
}

public class Singleton {

    public static void main(String[] args) {

        // Attempt to instantiate the `SingleObject` directly (compiler error)
        // SingleObject obj = new SingleObject();  // Uncommenting this line will result in a compilation error

        // Get the single instance of the `SingleObject` class
        SingleObject obj1 = SingleObject.getTestObject();
        SingleObject obj2 = SingleObject.getTestObject();
        System.err.println(obj1==obj2);
    }
}
