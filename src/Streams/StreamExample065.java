package Streams;

/**
 * Stream API example 65
 */
public class StreamExample065 {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(65, 66, 67, 68);
        numbers.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
    }
}
