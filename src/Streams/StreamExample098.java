package Streams;

/**
 * Stream API example 98
 */
public class StreamExample098 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(98, 99, 100, 101);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
