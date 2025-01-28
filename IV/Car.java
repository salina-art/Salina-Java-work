package IV;

public class Car {
    String model; // Instance variable

    // Parameterized Constructor
    public Car(String modelName) {
        model = modelName; // Assigning parameter to the instance variable
    }

    public void display() {
        System.out.println("Car Model: " + model);
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota Corolla"); // Passing argument to the constructor
        car.display(); // Calling the display method
    }
}
