package edu.greenriver.it.thymeleafdemo.controllers;

import edu.greenriver.it.thymeleafdemo.model.Product;
import edu.greenriver.it.thymeleafdemo.model.Sale;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("products")
public class ProductController
{
    private List<Product> fakeProducts = new ArrayList<>(Arrays.asList(new Product(
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
    ));

    @GetMapping("add")
    public String loadAddForm(Model model)
    {
        model.addAttribute("emptyProduct", new Product());
        return "add_products_form";
    }

    @PostMapping("add")
    public String handleAddForm(@ModelAttribute Product filledProduct)
    {
        //save the new product
        filledProduct.setOnSale(Sale.NO_SALE);
        fakeProducts.add(filledProduct);

        //redirect to the current deals page to show all products...
        return "redirect:current";
    }

    //URL should be http://localhost:8080/products/individual/fishingpole
    @GetMapping("individual/{name}")
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
    @GetMapping("current")
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









