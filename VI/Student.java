package VI;

public class Student {
    String name;
    int age;

    // Constructor to initialize student details
    public Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20); // Creating the first object
        Student student2 = new Student("Bob", 22); // Creating the second object

        student1.display(); // Calling display method for student1
        student2.display(); // Calling display method for student2
    }
}
