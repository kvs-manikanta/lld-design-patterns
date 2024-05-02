<<<<<<< HEAD:src/main/java/org/example/observerPattern/ObserverRegistry.java
package org.example.observerPattern;

public interface ObserverRegistry {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers(String stockName, double currentPrice);

=======
package org.example.observerPattern;

public interface ObserverRegistry {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers(String stockName, double currentPrice);

>>>>>>> d3eb2dcf251b2cb90e637fdba67219f571eda7ab:observerPattern/ObserverRegistry.java
}