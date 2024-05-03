<<<<<<< HEAD
=======
<<<<<<< HEAD:src/main/java/org/example/observerPattern/Client.java
>>>>>>> 523f6985be9a801e435692cb4f6b14f8688ae895
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
<<<<<<< HEAD
=======
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
>>>>>>> 523f6985be9a801e435692cb4f6b14f8688ae895
