package VIII;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running using Runnable.");
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable(); // Creating a Runnable object
        Thread thread = new Thread(runnable);  // Creating a thread with Runnable
        thread.start(); // Starting the thread
    }
}
