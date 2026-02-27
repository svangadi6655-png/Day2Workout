class Circle {
    double radius;

    // Constructor
    Circle(double r) {
        radius = r;
    }

    // Method to calculate area
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate circumference
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class Circleclass {
    public static void main(String[] args) {

        // Creating object
        Circle c1 = new Circle(5);

        // Displaying results
        System.out.println("Radius: " + c1.radius);
        System.out.println("Area: " + c1.calculateArea());
        System.out.println("Circumference: " + c1.calculateCircumference());
    }
}
