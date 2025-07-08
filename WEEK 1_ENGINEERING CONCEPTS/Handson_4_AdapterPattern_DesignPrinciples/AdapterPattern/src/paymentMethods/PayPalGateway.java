package paymentMethods;
// Adaptee for PayPal
public class PayPalGateway {
    public void makePayment(double amount){
        System.out.println("Processing payment through PayPal: " + amount);
    }
}

