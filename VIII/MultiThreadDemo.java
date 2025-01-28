package VIII;

class MyThread extends Thread {
    private String threadName;

    MyThread(String name) {
        this.threadName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " is running: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class MultiThreadDemo {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");

        thread1.start(); // Start thread 1
        thread2.start(); // Start thread 2
    }
}
