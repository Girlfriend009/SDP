public class PaymentC extends PaymentHandler {
    private int balance = 1000;

    @Override
    public void handle(int amount) {
        if (balance >= amount) {
            System.out.println("Paid " + amount + " using PaymentC.");
        } else {
            System.out.println("Insufficient funds in PaymentC.");
        }
    }
}
