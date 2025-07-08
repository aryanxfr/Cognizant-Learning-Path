import paymentMethods.*;

public class PaymentTest {
    public static void main(String[] args) {
        //Using paypal
        PaymentProcessor paypalProcessor=new PayPalAdapter(new PayPalGateway());
        paypalProcessor.processPayment(1000.0);

        //Using stripe
        PaymentProcessor stripeProcessor=new StripeAdapter(new StripeGateway());
        stripeProcessor.processPayment(2000);
    }
}
