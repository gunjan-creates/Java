package Streams;

/**
 * Stream API example 38
 */
public class StreamExample038 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(38, 39, 40, 41);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
