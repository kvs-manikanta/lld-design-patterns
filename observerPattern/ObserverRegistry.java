package org.example.observerPattern;

public interface ObserverRegistry {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers(String stockName, double currentPrice);

}