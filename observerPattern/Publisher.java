<<<<<<< HEAD
=======
<<<<<<< HEAD:src/main/java/org/example/observerPattern/Publisher.java
>>>>>>> 523f6985be9a801e435692cb4f6b14f8688ae895
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
<<<<<<< HEAD
=======
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
>>>>>>> 523f6985be9a801e435692cb4f6b14f8688ae895
