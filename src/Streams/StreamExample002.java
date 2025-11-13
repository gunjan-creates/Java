package Streams;

/**
 * Stream API example 2
 */
public class StreamExample002 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(2, 3, 4, 5);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
