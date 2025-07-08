package strategy;

public class CreditCardPayment implements PaymentStrategy{
    private String cardNumber;
    private String cardHolder;
    public CreditCardPayment(String cardHolder,String cardNumber){
        this.cardHolder=cardHolder;
        this.cardNumber=cardNumber;
    }
    public void pay(double amount){
        System.out.println("Paid $" + amount + "using Credit Card [" + cardNumber + "] by " + cardHolder);
    }
}
