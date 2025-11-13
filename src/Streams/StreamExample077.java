package Streams;

/**
 * Stream API example 77
 */
public class StreamExample077 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(77, 78, 79, 80);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
