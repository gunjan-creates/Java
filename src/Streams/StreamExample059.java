package Streams;

/**
 * Stream API example 59
 */
public class StreamExample059 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(59, 60, 61, 62);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
