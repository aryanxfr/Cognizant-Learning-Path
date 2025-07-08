package subject;

import observer.Observer;

public interface Stock {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String stockSymbol, double newPrice);
}
