package Streams;

/**
 * Stream API example 47
 */
public class StreamExample047 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(47, 48, 49, 50);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
