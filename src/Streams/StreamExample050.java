package Streams;

/**
 * Stream API example 50
 */
public class StreamExample050 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(50, 51, 52, 53);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
