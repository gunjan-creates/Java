package Multithreading;

/**
 * Threading example 51
 */
public class ThreadExample051 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread running: 51");
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
