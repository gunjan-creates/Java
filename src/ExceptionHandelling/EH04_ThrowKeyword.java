package ExceptionHandelling;

public class EH04_ThrowKeyword {
    static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be >= 18, got: " + age);
        }
        System.out.println("Age valid: " + age);
    }

    public static void main(String[] args) {
        System.out.println("[ExceptionHandelling] EH04_ThrowKeyword: start");
        try {
            validateAge(16);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        System.out.println("[ExceptionHandelling] EH04_ThrowKeyword: end");
    }
}
