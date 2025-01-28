package VI;

public class Display {
    // Method to display an integer
    public void show(int number) {
        System.out.println("Number: " + number);
    }

    // Overloaded method to display a string
    public void show(String text) {
        System.out.println("Text: " + text);
    }

    public static void main(String[] args) {
        Display display = new Display(); // Creating an object
        display.show(100); // Calling the method with an integer
        display.show("Hello World"); // Calling the overloaded method with a string
    }
}
