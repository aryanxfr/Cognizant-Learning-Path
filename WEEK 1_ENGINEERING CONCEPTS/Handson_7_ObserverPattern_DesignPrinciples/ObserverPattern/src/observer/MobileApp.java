package observer;

public class MobileApp implements Observer {
    private String user;
    public MobileApp(String user){
        this.user=user;
    }
    public void update(String stockSymbol,double newPrice){
        System.out.println("[Mobile]" + user + " notified: " + stockSymbol + "updated to " + newPrice);
    }
}
