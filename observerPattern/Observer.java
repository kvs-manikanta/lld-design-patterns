package org.example.observerPattern;

public interface Observer {
    public void notifySubcribers(String stockName, double currentPrice);
}