package org.example.AdapterPattern;

public interface BankApi {
    public void checkBalance(int accountNum);
    public void sendMoney(String from , String to , int money);
    public void Register(String customerId);

}
