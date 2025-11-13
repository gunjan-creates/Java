package Streams;

/**
 * Stream API example 74
 */
public class StreamExample074 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(74, 75, 76, 77);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
