package edu.greenriver.sdev.cookingtipsmvc.controllers;

import edu.greenriver.sdev.cookingtipsmvc.model.CookingTip;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("cooking") //this adds the path (cooking) before all paths defined above methods...
public class CookingController
{
    private CookingTip[] bakingTips = {
        new CookingTip("baking", "Always Have the Correct Butter Consistency."),
        new CookingTip("baking", "Room Temperature is KEY."),
        new CookingTip("baking", "Read the Recipe Before Beginning."),
        new CookingTip("baking", "Always Have Ingredients Prepped."),
        new CookingTip("baking", "Learn How to Measure."),
        new CookingTip("baking", "Weigh Your Ingredients."),
        new CookingTip("baking", "Get an Oven Thermometer."),
        new CookingTip("baking", "Keep Your Oven Door Closed.")
    };

    private CookingTip[] grillingTips = {
        new CookingTip("grilling", "Start with a clean grill."),
        new CookingTip("grilling", "Don’t move the food around."),
        new CookingTip("grilling", "Don’t squeeze or flatten meats."),
        new CookingTip("grilling", "Keep a spray bottle handy for flare-ups."),
        new CookingTip("grilling", "Buy a meat thermometer."),
        new CookingTip("grilling", "Avoid putting cold foods straight on the grill."),
        new CookingTip("grilling", "Undercook foods, just slightly."),
        new CookingTip("grilling", "Rest all meat!")
    };

    //loads at http://localhost:8080/single
    @RequestMapping(path = {"single", "tip", "", "tip/single"})
    public String singleTip(Model model)
    {
        CookingTip tip = bakingTips[3];
        model.addAttribute("singleTip", tip);

        return "single_tip";
    }

    //loads at http://localhost:8080/random
    @RequestMapping("random")
    public String randomTip()
    {
        return "random_tip";
    }

    //loads at http://localhost:8080/random/3
    //loads at http://localhost:8080/random/5
    @RequestMapping("random/{number}")
    public String multipleRandomTips(@PathVariable int number, Model model)
    {
        addTipsToModel(bakingTips, number, model);
        return "random_multiple_tips";
    }

    private void addTipsToModel(CookingTip[] tipsToChooseFrom, int number, Model model)
    {
        List<CookingTip> tips = new ArrayList<>();

        Random random = new Random();
        for (int i = 1; i <= number; i++)
        {
            CookingTip tip = tipsToChooseFrom[random.nextInt(tipsToChooseFrom.length)];
            tips.add(tip);
        }

        model.addAttribute("tips", tips);
    }

    //loads at http://localhost:8080/baking/random/3
    //loads at http://localhost:8080/grilling/random/7
    @RequestMapping("{cookingType}/random/{number}")
    public String getRandomTips(@PathVariable String cookingType,
                                @PathVariable int number, Model model)
    {
        switch (cookingType)
        {
            case "baking":
                addTipsToModel(bakingTips, number, model);
                break;
            case "grilling":
                addTipsToModel(grillingTips, number, model);
                break;
        }
        return "random_multiple_tips";
    }
}











