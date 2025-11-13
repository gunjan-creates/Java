package Multithreading;

/**
 * Threading example 19
 */
public class ThreadExample019 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println("Thread running: 19");
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
