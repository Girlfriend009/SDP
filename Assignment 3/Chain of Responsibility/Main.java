public class Main {
    public static void main(String[] args) {
        PaymentHandler paymentA = new PaymentA();
        PaymentHandler paymentB = new PaymentB();
        PaymentHandler paymentC = new PaymentC();

        paymentA.setNext(paymentB);
        paymentB.setNext(paymentC);

        int amount = 210;
        paymentA.handle(amount);
    }
}