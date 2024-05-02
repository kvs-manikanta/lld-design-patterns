package org.example.AdapterPattern;

public class PhonePe {

    private static BankApi bankApi=new YesBankAdapter();

    public static void main(String[] args) {
        bankApi.checkBalance(10000);
        bankApi.Register("987654321");
        bankApi.sendMoney("ABC","XYZ",987654321);
    }
}
