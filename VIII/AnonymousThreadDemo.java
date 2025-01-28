package VII;

public class AnonymousThreadDemo {
    public static void main(String[] args) {
        // Creating an anonymous thread
        Thread thread = new Thread() {
            public void run() {
                System.out.println("Anonymous thread is running.");
            }
        };

        thread.start(); // Start the thread
    }
}

