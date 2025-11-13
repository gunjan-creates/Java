package Multithreading;

/**
 * Threading example 11
 */
public class ThreadExample011 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread running: 11");
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread completed");
    }
}
