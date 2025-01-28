package VIII;

class Pillow extends Thread {
    public void run() {
        System.out.println("Thread is running.");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Pillow thread = new Pillow(); // Creating a thread object
        thread.start(); // Starting the thread
    }
}

