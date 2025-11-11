package ExceptionHandelling;
class AgeException extends Exception {
    AgeException(String msg) { super(msg); }
}

public class UserDefinedException {
    static void validate(int age) throws AgeException {
        if (age < 18)
            throw new AgeException("Age is below 18");
    }

    public static void main(String[] args) {
        try {
            validate(16);
        } catch (AgeException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
