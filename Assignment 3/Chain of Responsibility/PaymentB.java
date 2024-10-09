public class PaymentB extends PaymentHandler {
    private int balance = 300;

    @Override
    public void handle(int amount) {
        if (balance >= amount) {
            System.out.println("Paid " + amount + " using PaymentB.");
        } else if (next != null) {
            System.out.println("Insufficient funds in PaymentB. Passing to next...");
            next.handle(amount);
        }
    }
}
