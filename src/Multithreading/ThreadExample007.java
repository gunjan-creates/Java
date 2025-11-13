package Multithreading;

/**
 * Threading example 7
 */
public class ThreadExample007 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread running: 7");
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
