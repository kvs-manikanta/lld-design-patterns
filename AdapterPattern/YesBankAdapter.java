package org.example.AdapterPattern;

import org.example.AdapterPattern.yesbank.YesBank;

public class YesBankAdapter implements BankApi{
    YesBank yesBank=new YesBank();
    @Override
    public void checkBalance(int accountNum) {
        yesBank.CheckBalance(accountNum);
    }

    @Override
    public void sendMoney(String from, String to, int money) {
        yesBank.transferMoney(money,from,to);
    }

    @Override
    public void Register(String customerId) {
        System.out.println("registered account");
    }

}
