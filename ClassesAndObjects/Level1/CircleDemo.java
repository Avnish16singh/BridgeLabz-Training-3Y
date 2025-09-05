package ClassesAndObjects.Level1;
// Circle class
class Circle {
    // Attribute
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Method to display results
    void displayDetails() {
        System.out.println("Circle Details:");
        System.out.println("Radius        : " + radius);
        System.out.println("Area          : " + calculateArea());
        System.out.println("Circumference : " + calculateCircumference());
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        // Create Circle object
        Circle c1 = new Circle(7.0);

        // Display details
        c1.displayDetails();
    }
}
