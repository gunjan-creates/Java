package Streams;

/**
 * Stream API example 17
 */
public class StreamExample017 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(17, 18, 19, 20);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
