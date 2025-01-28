package X;

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block, and it always executes.");
        }
        System.out.println("Program continues...");
    }
}

