package Streams;

/**
 * Stream API example 80
 */
public class StreamExample080 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(80, 81, 82, 83);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
