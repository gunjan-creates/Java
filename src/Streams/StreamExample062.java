package Streams;

/**
 * Stream API example 62
 */
public class StreamExample062 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(62, 63, 64, 65);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
