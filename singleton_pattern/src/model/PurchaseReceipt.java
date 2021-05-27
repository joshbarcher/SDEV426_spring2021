package model;

import java.time.LocalDate;

/**
 * Assume there is only (ever) a single receipt
 * for a purchase.
 */
public class PurchaseReceipt
{
    //field(s) that store receipt data
    private LocalDate purchaseDate;
    private double total;
    private String paymentMethod;

    //static field that stores the singleton
    private static PurchaseReceipt instance;

    private PurchaseReceipt(LocalDate purchaseDate, double total,
                           String paymentMethod)
    {
        this.purchaseDate = purchaseDate;
        this.total = total;
        this.paymentMethod = paymentMethod;
    }

    public static PurchaseReceipt getInstance()
    {
        //lazy initialization (wait until the user asks for it)
        if (instance == null)
        {
            instance = new PurchaseReceipt(
                LocalDate.now(), 19.99, "Mastercard"
            );
        }

        return instance;
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
        return "PurchaseReceipt{" +
                "purchaseDate=" + purchaseDate +
                ", total=" + total +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
