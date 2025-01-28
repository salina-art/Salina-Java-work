package VI;

public class Calculator {
    // Method to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator(); // Creating an object
        System.out.println("Addition: " + calc.add(10, 5)); // Calling the add method
        System.out.println("Subtraction: " + calc.subtract(10, 5)); // Calling the subtract method
    }
}

