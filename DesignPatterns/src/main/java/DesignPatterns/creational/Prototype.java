package DesignPatterns.creational;

/**
 * Prototype Design Pattern Documentation
 *
	it is used for cloning the object
 *
 *
 */

// Prototype interface
interface Shape {
    Shape clone();
}

// Concrete prototype
class Circle implements Shape {
    int radius;

    Circle() {}

    // Copy constructor for cloning
    public Circle(Circle circle) {
        this.radius = circle.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object obj) {
        // Custom equals method to compare circle radius
        return radius == ((Circle)obj).radius;
    }
}

public class Prototype {
    public static void main(String[] args) {
        // Create a prototype instance
        Shape c1 = new Circle();

        // Clone the prototype to create a new instance
        Shape c2 = c1.clone();

        // Output comparison results
        System.out.println("Are the same object? " + (c1 == c2));
        System.out.println("Are copied? " + c1.equals(c2));
    }
}