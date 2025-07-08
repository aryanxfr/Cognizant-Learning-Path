package observer;

public class WebApp implements Observer{
    private String user;

    public WebApp(String user){
        this.user=user;
    }

    @Override
    public void update(String stockSymbol, double newPrice) {
        System.out.println("[Web] " + user + " notified: " + stockSymbol + " updated to " + newPrice);
    }
}
