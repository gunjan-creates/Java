package Streams;

/**
 * Stream API example 11
 */
public class StreamExample011 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(11, 12, 13, 14);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
