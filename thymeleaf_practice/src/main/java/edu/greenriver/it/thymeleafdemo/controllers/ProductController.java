package edu.greenriver.it.thymeleafdemo.controllers;

import edu.greenriver.it.thymeleafdemo.model.Product;
import edu.greenriver.it.thymeleafdemo.model.Sale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("products")
public class ProductController
{
    private Product[] fakeProducts = {
        new Product(
            "fishing_pole",
            79.99,
            "A must have for any angler.",
            Sale.ON_SALE
        ),
        new Product(
            "computer_monitor",
            199.99,
            "An LCD panel with 60hz.",
            Sale.ONE_TIME_ONLY
        ),
        new Product(
            "refrigerator_magnets",
            1.99,
            "A 5 pack of magnets for the fridge.",
            Sale.NO_SALE
        )
    };

    //URL should be http://localhost:8080/products/individual/fishingpole
    @RequestMapping("individual/{name}")
    public String showIndividualProduct(@PathVariable String name, Model model)
    {
        Product found = getProductByName(name);
        model.addAttribute("product", found);
        return "product_by_name";
    }

    private Product getProductByName(String name)
    {
        Product found = null;

        for (Product candidate : fakeProducts)
        {
            if (candidate.getName().equals(name))
            {
                return candidate;
            }
        }
        return null;
    }

    //URL should be http://localhost:8080/products/current
    @RequestMapping("current")
    public String showCurrentDeals(Model model)
    {
        //view variables...
        model.addAttribute("products", fakeProducts);
        model.addAttribute("highlighted", new Product(
                "fishing pole",
                79.99,
                "A must have for any angler.",
                Sale.ON_SALE
        ));

        return "current_deals";
    }
}









