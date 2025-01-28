package III;

public class ForEachExample {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};

        System.out.println("Fruits in the list:");
        for (String fruit : fruits) { // For-each loop to iterate over the array
            System.out.println(fruit);
        }
    }
}
