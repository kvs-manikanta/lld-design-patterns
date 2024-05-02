package org.example.observerPattern.services;

import org.example.observerPattern.Observer;
import org.example.observerPattern.utils.NotificationUtils;

public class SmsService implements Observer {

    public void sendSMS(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendSms(subject, message);
    }

    public void notifySubcribers(String stockName, double currentPrice)
    {
        sendSMS(stockName,currentPrice);
    }
}