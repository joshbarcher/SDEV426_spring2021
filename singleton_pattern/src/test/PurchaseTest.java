package test;

import model.PurchaseReceipt;

import java.time.LocalDate;

public class PurchaseTest
{
    public static void main(String[] args)
    {
        PurchaseReceipt receipt1 = PurchaseReceipt.getInstance();
        System.out.println(receipt1);

        PurchaseReceipt receipt2 = PurchaseReceipt.getInstance();
        System.out.println(receipt2);

        System.out.println(receipt1 == receipt2);
    }
}
