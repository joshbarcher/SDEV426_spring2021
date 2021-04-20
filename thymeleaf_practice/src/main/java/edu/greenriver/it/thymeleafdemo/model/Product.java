package edu.greenriver.it.thymeleafdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product
{
    private String name;
    private double price;
    private String description;
    private Sale onSale;

    public String getOnSale()
    {
        switch (onSale)
        {
            case ON_SALE:
                return "on sale";
            case NO_SALE:
                return "no sale";
            case ONE_TIME_ONLY:
                return "one time only";
            case PREMIER_DEAL:
                return "premier deal";
        }
        return null;
    }
}

