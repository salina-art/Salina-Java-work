package VII;

class MenuItem {
    void price() {
        System.out.println("Menu items have different prices.");
    }
}

class Beverage extends MenuItem {
    @Override
    void price() {
        System.out.println("Beverages cost around $5.");
    }
}

class MainCourse extends MenuItem {
    @Override
    void price() {
        System.out.println("Main courses cost around $15.");
    }
}

public class Restaurant {
    public static void main(String[] args) {
        MenuItem beverage = new Beverage();
        MenuItem mainCourse = new MainCourse();
        beverage.price();
        mainCourse.price();
    }
}
