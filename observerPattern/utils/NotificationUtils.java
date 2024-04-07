package org.example.observerPattern.utils;

public class NotificationUtils {
    public static void sendEmail(String subject, String content) {
        System.out.println("Sent via Email");
    }

    public static void sendSms(String subject, String content) {
        System.out.println("sent via SMS");
    }

    public static void sendPush(String subject, String content) {
        System.out.println("send via App service");
    }
}
