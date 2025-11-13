package Streams;

/**
 * Stream API example 26
 */
public class StreamExample026 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(26, 27, 28, 29);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
