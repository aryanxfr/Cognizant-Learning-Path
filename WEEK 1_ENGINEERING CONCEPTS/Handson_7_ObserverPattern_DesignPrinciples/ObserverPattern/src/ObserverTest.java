import observer.MobileApp;
import observer.WebApp;
import subject.StockMarket;

public class ObserverTest {
    public static void main(String[] args){
        StockMarket nseMarket=new StockMarket("NSE");

        MobileApp user1Mobile=new MobileApp("DOE");
        WebApp user2Web=new WebApp("JOHN");

        // Register observers
        nseMarket.registerObserver(user1Mobile);
        nseMarket.registerObserver(user2Web);

        // Simulate stock price updates
        nseMarket.changePrice("REDBULL", 3550.75);
        nseMarket.changePrice("SPACEX", 1480.50);

        // Unsubscribe one observer
        nseMarket.removeObserver(user2Web);

        nseMarket.changePrice("RELIANCE", 2805.60);
    }
}
