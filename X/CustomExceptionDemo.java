package X;

// Custom exception class
class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            validateNumber(-10); // Passing an invalid number
        } catch (InvalidNumberException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Method to validate the number
    public static void validateNumber(int number) throws InvalidNumberException {
        if (number < 0) {
            throw new InvalidNumberException("Number must not be negative.");
        }
        System.out.println("Valid number: " + number);
    }
}

