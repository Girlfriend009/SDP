package BehavioralPatterns.Chain;

// Аналогичные классы для PaymentB и PaymentC
class PaymentB extends PaymentHandler {
    private double balance = 300;

    @Override
    public void handlePayment(double amount) {
        if (balance >= amount) {
            System.out.println("Платеж на сумму $" + amount + " обработан через Payment B");
        } else if (next != null) {
            next.handlePayment(amount);
        }
    }
}

