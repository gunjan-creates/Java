package Streams;

/**
 * Stream API example 92
 */
public class StreamExample092 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(92, 93, 94, 95);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
