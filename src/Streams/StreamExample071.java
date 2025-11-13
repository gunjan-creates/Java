package Streams;

/**
 * Stream API example 71
 */
public class StreamExample071 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(71, 72, 73, 74);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
