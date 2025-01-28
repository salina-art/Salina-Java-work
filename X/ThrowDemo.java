package X;

public class ThrowDemo {
    public static void main(String[] args) {
        try {
            checkAge(15); // Passing an invalid age
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Method to check age
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18.");
        }
        System.out.println("Age is valid.");
    }
}

