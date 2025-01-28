package X;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Division by zero (will cause an exception)
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }
}

