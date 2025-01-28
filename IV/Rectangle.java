package IV;

public class Rectangle {
    int length;
    int width;

    // Parameterized Constructor
    public Rectangle(int l, int w) {
        length = l;
        width = w;
        System.out.println("Rectangle created with length " + length + " and width " + width);
    }

    public int calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5); // Object creation with dimensions
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
