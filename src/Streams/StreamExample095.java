package Streams;

/**
 * Stream API example 95
 */
public class StreamExample095 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(95, 96, 97, 98);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
