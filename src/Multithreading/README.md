# Multithreading Package - 100 Beginner Java Programs

This package contains 100 example programs demonstrating multithreading concepts in Java.

## Topics Covered

### Thread Basics (Programs 1-25)
- Creating threads (Thread class)
- Runnable interface
- Thread lifecycle
- Thread states
- Basic thread operations

### Synchronization (Programs 26-50)
- synchronized keyword
- Synchronized blocks
- Synchronized methods
- Thread safety
- Race conditions

### Advanced Threading (Programs 51-75)
- ExecutorService
- Thread pools
- Callable and Future
- CompletableFuture
- Atomic operations

### Concurrent Collections (Programs 76-100)
- ConcurrentHashMap
- CopyOnWriteArrayList
- BlockingQueue
- Thread communication
- Best practices

## How to Run

```bash
# Compile all programs
make build

# Run a specific program
make run CLASS=Multithreading.MultithreadingDemo
make run CLASS=Multithreading.ThreadExample007
```

## Learning Path

1. Start with basic thread creation
2. Understand synchronization
3. Learn about thread pools and executors
4. Master concurrent collections

## Tips for Beginners

- Understand thread safety
- Avoid shared mutable state when possible
- Use higher-level concurrency utilities
- Be careful with synchronization to avoid deadlocks
- Test multithreaded code thoroughly
