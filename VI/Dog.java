package VI;

public class Dog {
    String name; // Instance variable

    // Method to set the dog's name
    public void setName(String dogName) {
        name = dogName;
    }

    // Method to display the dog's name
    public void displayName() {
        System.out.println("Dog's Name: " + name);
    }

    public static void main(String[] args) {
        Dog myDog = new Dog(); // Creating an object
        myDog.setName("Buddy"); // Calling a method
        myDog.displayName(); // Displaying the dog's name
    }
}
