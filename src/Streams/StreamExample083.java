package Streams;

/**
 * Stream API example 83
 */
public class StreamExample083 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(83, 84, 85, 86);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
