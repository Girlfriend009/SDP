public class PaymentA extends PaymentHandler {
    private int balance = 100;

    @Override
    public void handle(int amount) {
        if (balance >= amount) {
            System.out.println("Paid " + amount + " using PaymentA.");
        } else if (next != null) {
            System.out.println("Insufficient funds in PaymentA. Passing to next...");
            next.handle(amount);
        }
    }
}