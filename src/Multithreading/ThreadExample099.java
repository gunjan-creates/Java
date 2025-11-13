package Multithreading;

/**
 * Threading example 99
 */
public class ThreadExample099 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread running: 99");
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
