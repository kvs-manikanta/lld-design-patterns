package org.example.AdapterPattern;

import org.example.AdapterPattern.hdfcBank.HDFCBank;

public class HDFCBankAdapter implements BankApi{
    HDFCBank hdfcBank=new HDFCBank();
    @Override
    public void checkBalance(int accountNum) {
        hdfcBank.CheckBalance(accountNum);
    }

    @Override
    public void sendMoney(String from, String to, int money) {
        hdfcBank.makePayment(from,money,to);
    }

    @Override
    public void Register(String customerId) {
        System.out.println("Registered the Custormer");
    }

}
