package Streams;

/**
 * Stream API example 44
 */
public class StreamExample044 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(44, 45, 46, 47);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
