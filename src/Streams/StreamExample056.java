package Streams;

/**
 * Stream API example 56
 */
public class StreamExample056 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(56, 57, 58, 59);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
