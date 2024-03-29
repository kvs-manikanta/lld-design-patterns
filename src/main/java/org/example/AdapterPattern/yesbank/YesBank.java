package org.example.AdapterPattern.yesbank;

public class YesBank {

    public void transferMoney(int money , String from , String to)
    {
        System.out.println("Money has been transferred via Yes Bank");
    }

    public int CheckBalance(int customerId)
    {
        System.out.println("Please find the available balance");
        return 10000;
    }
}
