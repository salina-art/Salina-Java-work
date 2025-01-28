package VI;

public class Circle {
    double radius;

    // Constructor to initialize the radius
    public Circle(double r) {
        radius = r;
    }

    // Method to calculate area
    public double calculateArea() {
        return 3.14 * radius * radius; // Area formula
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * 3.14 * radius; // Circumference formula
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5); // Creating an object with radius 5
        System.out.println("Area: " + circle.calculateArea()); // Displaying the area
        System.out.println("Circumference: " + circle.calculateCircumference()); // Displaying the circumference
    }
}
