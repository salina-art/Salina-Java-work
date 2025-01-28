package V;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Division by zero
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
