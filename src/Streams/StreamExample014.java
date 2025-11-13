package Streams;

/**
 * Stream API example 14
 */
public class StreamExample014 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(14, 15, 16, 17);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
