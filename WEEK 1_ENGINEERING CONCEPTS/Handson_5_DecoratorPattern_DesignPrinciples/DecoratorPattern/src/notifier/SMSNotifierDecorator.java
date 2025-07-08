package notifier;

public class SMSNotifierDecorator extends NotifierDecorator{
    private String phoneNumber;

    public SMSNotifierDecorator(Notifier notifier, String phoneNumber){
        super(notifier);
        this.phoneNumber = phoneNumber;
    }
    @Override
    public void send(String message){
        System.out.println("Sending SMS to " + phoneNumber + ":" + message);
    }
}
