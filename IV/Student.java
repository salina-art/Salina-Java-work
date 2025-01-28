package IV;

public class Student {
    private String name; // Private instance variable
    private int age;

    // Parameterized Constructor
    public Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Student student = new Student("Alice", 20); // Object creation with parameterized constructor
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Age: " + student.getAge());
    }
}

