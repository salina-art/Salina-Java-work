package IV;

public class Book {
    String title;
    double price;

    // Default Constructor
    public Book() {
        title = "Unknown";
        price = 0.0;
    }

    // Parameterized Constructor
    public Book(String bookTitle, double bookPrice) {
        title = bookTitle;
        price = bookPrice;
    }

    public void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Price: $" + price);
    }

    public static void main(String[] args) {
        Book defaultBook = new Book(); // Using default constructor
        Book specificBook = new Book("Java Programming", 29.99); // Using parameterized constructor

        defaultBook.display();
        System.out.println();
        specificBook.display();
    }
}

