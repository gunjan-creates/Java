package Streams;

/**
 * Stream API example 29
 */
public class StreamExample029 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(29, 30, 31, 32);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
