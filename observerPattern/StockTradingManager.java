<<<<<<< HEAD
=======
<<<<<<< HEAD:src/main/java/org/example/observerPattern/StockTradingManager.java
>>>>>>> 523f6985be9a801e435692cb4f6b14f8688ae895
package org.example.observerPattern;

public class StockTradingManager extends Publisher{

    private String stockName;
    private double currentPrice;
    private double notificationThreshold;

    // DO NOT MODIFY THIS CONSTRUCTOR
    public StockTradingManager(String stockName, double initialPrice, double notificationThreshold) {
        this.stockName = stockName;
        this.currentPrice = initialPrice;
        this.notificationThreshold = notificationThreshold;
    }
    // DO NOT MODIFY THIS CONSTRUCTOR

    public void updateStockPrice(double newPrice) {
        currentPrice = newPrice;
        if (currentPrice > notificationThreshold) {
            notifyObservers(stockName,currentPrice);
        }
    }

<<<<<<< HEAD
=======
=======
package org.example.observerPattern;

public class StockTradingManager extends Publisher{

    private String stockName;
    private double currentPrice;
    private double notificationThreshold;

    // DO NOT MODIFY THIS CONSTRUCTOR
    public StockTradingManager(String stockName, double initialPrice, double notificationThreshold) {
        this.stockName = stockName;
        this.currentPrice = initialPrice;
        this.notificationThreshold = notificationThreshold;
    }
    // DO NOT MODIFY THIS CONSTRUCTOR

    public void updateStockPrice(double newPrice) {
        currentPrice = newPrice;
        if (currentPrice > notificationThreshold) {
            notifyObservers(stockName,currentPrice);
        }
    }

>>>>>>> d3eb2dcf251b2cb90e637fdba67219f571eda7ab:observerPattern/StockTradingManager.java
>>>>>>> 523f6985be9a801e435692cb4f6b14f8688ae895
}