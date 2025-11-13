package Streams;

/**
 * Stream API example 53
 */
public class StreamExample053 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(53, 54, 55, 56);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
