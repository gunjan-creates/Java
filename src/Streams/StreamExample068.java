package Streams;

/**
 * Stream API example 68
 */
public class StreamExample068 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(68, 69, 70, 71);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
