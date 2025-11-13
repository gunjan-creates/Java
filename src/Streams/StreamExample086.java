package Streams;

/**
 * Stream API example 86
 */
public class StreamExample086 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(86, 87, 88, 89);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
