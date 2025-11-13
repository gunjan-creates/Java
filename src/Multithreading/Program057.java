package Multithreading;

/**
 * Demonstrates collection initialization - Example 57
 */
public class Program057 {
    public static void main(String[] args) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        for (int i = 57; i < 62; i++) {
            list.add(i);
        }
        System.out.println("List: " + list);
        System.out.println("Size: " + list.size());
    }
}
