package BehavioralPatterns.Chain;

class PaymentC extends PaymentHandler {
    private double balance = 1000;

    @Override
    public void handlePayment(double amount) {
        if (balance >= amount) {
            System.out.println("Платеж на сумму $" + amount + " обработан через Payment C");
        } else {
            System.out.println("Недостаточно средств на всех счетах.");
        }
    }
}