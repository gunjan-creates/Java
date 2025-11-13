package ExceptionHandelling;

class InvalidOrderException extends Exception {
    public InvalidOrderException(String message) { super(message); }
}

public class EH06_CustomCheckedException {
    static void placeOrder(int qty) throws InvalidOrderException {
        if (qty <= 0) throw new InvalidOrderException("Quantity must be positive");
        System.out.println("Order placed with qty=" + qty);
    }

    public static void main(String[] args) {
        try {
            placeOrder(0);
        } catch (InvalidOrderException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
