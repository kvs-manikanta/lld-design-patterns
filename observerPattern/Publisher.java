<<<<<<< HEAD:src/main/java/org/example/observerPattern/Publisher.java
package org.example.observerPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher implements ObserverRegistry{

    List<Observer> subs=new ArrayList();

    public void addObserver(Observer observer)
    {
        subs.add(observer);
    }

    public void removeObserver(Observer observer)
    {
        subs.remove(observer);
    }

    public void notifyObservers(String stockName, double currentPrice)
    {
        for(Observer sub : subs)
        {
            sub.notifySubcribers(stockName,currentPrice);
        }
    }
}
=======
package org.example.observerPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher implements ObserverRegistry{

    List<Observer> subs=new ArrayList();

    public void addObserver(Observer observer)
    {
        subs.add(observer);
    }

    public void removeObserver(Observer observer)
    {
        subs.remove(observer);
    }

    public void notifyObservers(String stockName, double currentPrice)
    {
        for(Observer sub : subs)
        {
            sub.notifySubcribers(stockName,currentPrice);
        }
    }
}
>>>>>>> d3eb2dcf251b2cb90e637fdba67219f571eda7ab:observerPattern/Publisher.java
