package Multithreading;
import java.util.concurrent.*;
class Task implements Runnable {
    public void run(){
        System.out.println(Thread.currentThread().getName()+" is Running");
    }
}
public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);
        executor.execute(new Task());
        executor.execute(new Task());
        executor.execute(new Task());
        executor.execute(new Task());
    }
}
