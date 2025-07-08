import strategy.CreditCardPayment;
import strategy.PayPalPayment;
import context.PaymentContext;

public class StrategyTest {
    public static void main(String[] args) {
        PaymentContext context=new PaymentContext();

        //Pay with Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "JOHN"));
        context.executePayment(500.00);

        // Pay with PayPal
        context.setPaymentStrategy(new PayPalPayment("john@example.com"));
        context.executePayment(850.75);
    }
}
