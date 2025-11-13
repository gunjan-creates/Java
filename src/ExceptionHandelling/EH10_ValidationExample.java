package ExceptionHandelling;

public class EH10_ValidationExample {
    static void validateEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email: " + email);
        }
        System.out.println("Valid email: " + email);
    }

    public static void main(String[] args) {
        try {
            validateEmail("not-an-email");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
