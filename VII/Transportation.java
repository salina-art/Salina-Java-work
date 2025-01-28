package VII;

class Vehicle {
    void move() {
        System.out.println("This vehicle moves.");
    }
}

class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("This car drives on the road.");
    }
}

public class Transportation {
    public static void main(String[] args) {
        Car car = new Car(); // Creating an object of the child class
        car.move(); // Calls the overridden method in the child class
    }
}
