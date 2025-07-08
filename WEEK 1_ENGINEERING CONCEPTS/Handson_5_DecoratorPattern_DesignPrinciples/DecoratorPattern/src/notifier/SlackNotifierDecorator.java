package notifier;

public class SlackNotifierDecorator extends NotifierDecorator{
    private String slackChannel;
    public SlackNotifierDecorator(Notifier notifier, String slackChannel){
        super(notifier);
        this.slackChannel = slackChannel;
    }

    @Override
    public void send(String message){
        super.send(message);
        System.out.println("Sending Slack message to channel #" + slackChannel + ": " + message);
    }
}
