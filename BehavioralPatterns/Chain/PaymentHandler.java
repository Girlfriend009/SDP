package BehavioralPatterns.Chain;

// Абстрактный класс обработчика платежей, от которого наследуются конкретные обработчики
abstract class PaymentHandler {
    protected PaymentHandler next; // Ссылка на следующий обработчик в цепочке

    // Метод для задания следующего обработчика
    public void setNext(PaymentHandler next) {
        this.next = next;
    }

    // Абстрактный метод для обработки платежа, который должен быть реализован в наследниках
    public abstract void handlePayment(double amount);
}

