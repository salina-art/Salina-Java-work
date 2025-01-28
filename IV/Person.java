package IV;

public class Person {
    String name; // Instance variable

    // Default Constructor
    public Person() {
        name = "John Doe"; // Assigning default value
    }

    public void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Person person = new Person(); // Object creation
        person.display(); // Calling the display method
    }
}
