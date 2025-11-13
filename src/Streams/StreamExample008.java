package Streams;

/**
 * Stream API example 8
 */
public class StreamExample008 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(8, 9, 10, 11);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
