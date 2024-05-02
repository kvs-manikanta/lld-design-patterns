<<<<<<< HEAD:src/main/java/org/example/observerPattern/Client.java
package org.example.observerPattern;

import org.example.observerPattern.services.AppService;
import org.example.observerPattern.services.EmailService;
import org.example.observerPattern.services.SmsService;

public class Client {
    public static void main(String[] args) {
        StockTradingManager stockTradingManager = new StockTradingManager("Oracle" ,
                                                                        140 , 136);
        stockTradingManager.addObserver(new AppService());
        stockTradingManager.addObserver(new EmailService());
        stockTradingManager.addObserver(new SmsService());
        stockTradingManager.updateStockPrice(150);


    }
}
=======
package org.example.observerPattern;

import org.example.observerPattern.services.AppService;
import org.example.observerPattern.services.EmailService;
import org.example.observerPattern.services.SmsService;

public class Client {
    public static void main(String[] args) {
        StockTradingManager stockTradingManager = new StockTradingManager("Oracle" ,
                                                                        140 , 136);
        stockTradingManager.addObserver(new AppService());
        stockTradingManager.addObserver(new EmailService());
        stockTradingManager.addObserver(new SmsService());
        stockTradingManager.updateStockPrice(150);


    }
}
>>>>>>> d3eb2dcf251b2cb90e637fdba67219f571eda7ab:observerPattern/Client.java
