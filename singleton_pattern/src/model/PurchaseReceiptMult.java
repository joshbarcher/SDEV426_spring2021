package model;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PurchaseReceiptMult
{
    //field(s) that store receipt data
    private LocalDate purchaseDate;
    private double total;
    private String paymentMethod;

    //stores multiple singletons
    private static Map<String, PurchaseReceiptMult> instances = new HashMap<>();
    private static String[] multNames = {"receipt1", "receipt2", "receipt3"};

    private PurchaseReceiptMult(LocalDate purchaseDate, double total,
                               String paymentMethod)
    {
        this.purchaseDate = purchaseDate;
        this.total = total;
        this.paymentMethod = paymentMethod;
    }

    public static PurchaseReceiptMult getInstance(String name)
    {
        //make sure we support the name
        if (!validName(name))
        {
            return null;
        }

        //lazily create the objects if they don't already exist
        if (!instances.containsKey(name))
        {
            //add all three instances
            instances.put("receipt1", new PurchaseReceiptMult(LocalDate.now(), 29.99, "Mastercard"));
            instances.put("receipt2", new PurchaseReceiptMult(LocalDate.now(), 19.99, "Visa"));
            instances.put("receipt3", new PurchaseReceiptMult(LocalDate.now(), 39.99, "Cash"));
        }

        //return the object requested
        return instances.get(name);
    }

    private static boolean validName(String name)
    {
        for (int i = 0; i < multNames.length; i++)
        {
            if (multNames[i].equals(name))
            {
                return true;
            }
        }
        return false;
    }

    public LocalDate getPurchaseDate()
    {
        return purchaseDate;
    }

    public double getTotal()
    {
        return total;
    }

    public String getPaymentMethod()
    {
        return paymentMethod;
    }

    @Override
    public String toString()
    {
        return "PurchaseReceiptMult{" +
                "purchaseDate=" + purchaseDate +
                ", total=" + total +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
