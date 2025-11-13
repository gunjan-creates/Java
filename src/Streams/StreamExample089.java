package Streams;

/**
 * Stream API example 89
 */
public class StreamExample089 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(89, 90, 91, 92);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
