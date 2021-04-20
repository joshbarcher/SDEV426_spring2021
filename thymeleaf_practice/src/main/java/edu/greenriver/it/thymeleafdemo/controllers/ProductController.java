package edu.greenriver.it.thymeleafdemo.controllers;

import edu.greenriver.it.thymeleafdemo.model.Product;
import edu.greenriver.it.thymeleafdemo.model.Sale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("products")
public class ProductController
{
    private Product[] fakeProducts = {
        new Product(
            "fishing pole",
            79.99,
            "A must have for any angler.",
            Sale.ON_SALE
        ),
        new Product(
            "computer monitor",
            199.99,
            "An LCD panel with 60hz.",
            Sale.ONE_TIME_ONLY
        ),
        new Product(
            "Refrigerator magnets",
            1.99,
            "A 5 pack of magnets for the fridge.",
            Sale.NO_SALE
        )
    };

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









