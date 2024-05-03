<<<<<<< HEAD
=======
<<<<<<< HEAD:src/main/java/org/example/observerPattern/services/AppService.java
>>>>>>> 523f6985be9a801e435692cb4f6b14f8688ae895
package org.example.observerPattern.services;

import org.example.observerPattern.Observer;
import org.example.observerPattern.utils.NotificationUtils;

public class AppService implements Observer {
    public void sendPush(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendPush(subject, message);
    }

    public void notifySubcribers(String stockName, double currentPrice)
    {
        sendPush(stockName,currentPrice);
    }
<<<<<<< HEAD
=======
=======
package org.example.observerPattern.services;

import org.example.observerPattern.Observer;
import org.example.observerPattern.utils.NotificationUtils;

public class AppService implements Observer {
    public void sendPush(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendPush(subject, message);
    }

    public void notifySubcribers(String stockName, double currentPrice)
    {
        sendPush(stockName,currentPrice);
    }
>>>>>>> d3eb2dcf251b2cb90e637fdba67219f571eda7ab:observerPattern/services/AppService.java
>>>>>>> 523f6985be9a801e435692cb4f6b14f8688ae895
}