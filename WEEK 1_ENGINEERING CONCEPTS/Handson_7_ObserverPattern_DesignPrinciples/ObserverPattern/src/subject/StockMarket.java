package subject;

import observer.Observer;
import java.util.List;
import java.util.ArrayList;
public class StockMarket implements Stock {
    private List<Observer> observers;
    private final String marketName;
    public StockMarket(String marketName){
        this.marketName = marketName;
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
        System.out.println("[StockMarket] Observer registered.");
    }
    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
        System.out.println("[StockMarket] Observer removed.");
    }
    @Override
    public void notifyObservers(String stockSymbol, double newPrice){
        System.out.println("[StockMarket] Notifying observers about: " + stockSymbol + " = " + newPrice);
        for (Observer o : observers) {
            o.update(stockSymbol, newPrice);
        }
    }
    public void changePrice(String stockSymbol, double newPrice){
        System.out.println("\n[StockMarket] Price changed: " + stockSymbol + " = " + newPrice);
        notifyObservers(stockSymbol, newPrice);
    }
}
