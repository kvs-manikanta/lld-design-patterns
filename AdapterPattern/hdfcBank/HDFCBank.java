package org.example.AdapterPattern.hdfcBank;

public class HDFCBank {
    public void makePayment(String from , int money , String to)
    {
        System.out.println("Money has been transferred via HDFC Bank");
    }

    public void CheckBalance(int customerId)
    {
        System.out.println("Please find the available balance in your bank , Checked via HDFC");
    }
}
