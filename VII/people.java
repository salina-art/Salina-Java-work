package VII;

class Person {
    void display() {
        System.out.println("This is a person.");
    }
}

class Teacher extends Person {
    @Override
    void display() {
        super.display(); // Calls the parent class method
        System.out.println("This is a student.");
    }
}

public class people {
    public static void main(String[] args) {
        Student student = new Student(); // Creating an object of the child class
        student.display(); // Calls the overridden method
    }
}
