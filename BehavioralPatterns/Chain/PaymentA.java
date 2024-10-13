package BehavioralPatterns.Chain;

// Класс для платежей типа A с балансом в $100
class PaymentA extends PaymentHandler {
    private double balance = 100; // Баланс для этого метода оплаты

    @Override
    public void handlePayment(double amount) {
        // Проверка, может ли этот способ оплатить покупку
        if (balance >= amount) {
            System.out.println("Платеж на сумму $" + amount + " обработан через Payment A");
        } else if (next != null) {
            // Если недостаточно средств, передаем запрос следующему обработчику
            next.handlePayment(amount);
        }
    }
}

