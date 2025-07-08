import notifier.*;
public class DecoratorTest {
    public static void main(String[] args) {
        // Step 1: Basic email notifier
        Notifier notifier=new EmailNotifier("6401676@example.com");

        // Step 2: Add SMS notification
        notifier=new SMSNotifierDecorator(notifier, "+91-123456789");

        // Step 3: Add Slack notification
        notifier=new SlackNotifierDecorator(notifier, "project-alerts");

        // Step 4: Send message via all channels
        notifier.send("Message send to all channels");
    }
}
