package Streams;

/**
 * Stream API example 5
 */
public class StreamExample005 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(5, 6, 7, 8);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
