# Streams Package - 100 Beginner Java Programs

This package contains 100 example programs demonstrating Java Stream API.

## Topics Covered

### Stream Basics (Programs 1-25)
- Creating streams
- Stream sources
- Terminal operations
- Intermediate operations
- Stream pipeline

### Stream Operations (Programs 26-50)
- filter, map, flatMap
- forEach, peek
- sorted, distinct
- limit, skip
- reduce operations

### Collectors (Programs 51-75)
- toList, toSet, toMap
- groupingBy
- partitioningBy
- joining
- summarizing

### Advanced Streams (Programs 76-100)
- Parallel streams
- Optional handling
- Custom collectors
- Stream performance
- Best practices

## How to Run

```bash
# Compile all programs
make build

# Run a specific program
make run CLASS=Streams.StreamOperationsExample
make run CLASS=Streams.StreamExample002
```

## Learning Path

1. Understand stream creation and basics
2. Learn intermediate and terminal operations
3. Master collectors
4. Explore parallel streams and performance

## Tips for Beginners

- Streams are for processing, not storage
- Streams are lazy - operations execute only when needed
- Use method references for cleaner code
- Understand the difference between intermediate and terminal operations
- Be careful with parallel streams - they're not always faster
