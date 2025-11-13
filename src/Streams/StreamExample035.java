package Streams;

/**
 * Stream API example 35
 */
public class StreamExample035 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(35, 36, 37, 38);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
