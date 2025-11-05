package Multithreading;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import java.util.ArrayList;

public class MultithreadingDemo {
    // Atomic counter for thread-safe operations
    private static final AtomicInteger counter = new AtomicInteger(0);
    
    // Simulated shared resource
    private static class SharedResource {
        private int value = 0;
        private final Object lock = new Object();
        
        public void incrementSynchronized() {
            synchronized(lock) {
                value++;
                System.out.println(Thread.currentThread().getName() + " incremented value to " + value);
                try {
                    Thread.sleep(100); // Simulate some work
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
    
    // Custom thread class extending Thread
    static class CustomThread extends Thread {
        public void run() {
            System.out.println("CustomThread " + getName() + " is running");
            counter.incrementAndGet();
        }
    }
    
    // Runnable implementation
    static class CustomRunnable implements Runnable {
        public void run() {
            System.out.println("CustomRunnable in " + Thread.currentThread().getName() + " is running");
            counter.incrementAndGet();
        }
    }
    
    // Callable implementation returning a result
    static class CustomCallable implements Callable<String> {
        private final int id;
        
        public CustomCallable(int id) {
            this.id = id;
        }
        
        public String call() throws Exception {
            // Simulate some work
            Thread.sleep(1000);
            return "Result from CustomCallable " + id;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("=== Java Multithreading Demo ===\n");
        
        // 1. Basic Thread Creation
        System.out.println("1. Demonstrating basic thread creation:");
        Thread thread1 = new CustomThread();
        Thread thread2 = new Thread(new CustomRunnable());
        
        thread1.start();
        thread2.start();
        
        // Wait for basic threads to complete
        thread1.join();
        thread2.join();
        System.out.println("Counter value after basic threads: " + counter.get() + "\n");
        
        // 2. Thread Pool with ExecutorService
        System.out.println("2. Demonstrating ExecutorService with thread pool:");
        ExecutorService executor = Executors.newFixedThreadPool(3);
        
        // Submit multiple tasks
        List<Future<String>> futures = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            futures.add(executor.submit(new CustomCallable(i)));
        }
        
        // Get results from futures
        for (Future<String> future : futures) {
            System.out.println(future.get());
        }
        System.out.println();
        
        // 3. Synchronized Block Demo
        System.out.println("3. Demonstrating synchronized block:");
        SharedResource sharedResource = new SharedResource();
        
        // Create multiple threads accessing shared resource
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(() -> {
                sharedResource.incrementSynchronized();
            });
            threads.add(t);
            t.start();
        }
        
        // Wait for all threads to complete
        for (Thread t : threads) {
            t.join();
        }
        System.out.println();
        
        // 4. CompletableFuture Demo
        System.out.println("4. Demonstrating CompletableFuture:");
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500);
                return "First";
            } catch (InterruptedException e) {
                return "Error";
            }
        });
        
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(300);
                return "Second";
            } catch (InterruptedException e) {
                return "Error";
            }
        });
        
        // Combine results when both futures complete
        CompletableFuture<String> combined = future1.thenCombine(future2,
            (result1, result2) -> result1 + " and " + result2);
            
        System.out.println("Combined result: " + combined.get());
        
        // Shutdown executor
        executor.shutdown();
        try {
            if (!executor.awaitTermination(800, TimeUnit.MILLISECONDS)) {
                executor.shutdownNow();
            }
        } catch (InterruptedException e) {
            executor.shutdownNow();
        }
    }
}