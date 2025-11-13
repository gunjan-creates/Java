package Streams;

/**
 * Stream API example 32
 */
public class StreamExample032 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(32, 33, 34, 35);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
