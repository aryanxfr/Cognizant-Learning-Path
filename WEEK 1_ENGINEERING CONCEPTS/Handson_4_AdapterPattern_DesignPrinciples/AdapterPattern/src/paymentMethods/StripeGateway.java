package paymentMethods;

public class StripeGateway {
    public void pay(double amount) {
        System.out.println("Processing payment through Stripe: " + amount);
    }
}
