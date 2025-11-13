package Streams;

/**
 * Stream API example 41
 */
public class StreamExample041 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(41, 42, 43, 44);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
