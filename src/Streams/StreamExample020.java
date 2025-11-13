package Streams;

/**
 * Stream API example 20
 */
public class StreamExample020 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(20, 21, 22, 23);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
