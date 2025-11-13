package Streams;

/**
 * Stream API example 23
 */
public class StreamExample023 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(23, 24, 25, 26);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
