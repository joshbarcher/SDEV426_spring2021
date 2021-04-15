package edu.greenriver.sdev.cookingtipsmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BakingController
{
    private String[] bakingTips = {
        "Always Have the Correct Butter Consistency.",
        "Room Temperature is KEY.",
        "Read the Recipe Before Beginning.",
        "Always Have Ingredients Prepped.",
        "Learn How to Measure.",
        "Weigh Your Ingredients.",
        "Get an Oven Thermometer.",
        "Keep Your Oven Door Closed."
    };

    //loads at http://localhost:8080/single
    @RequestMapping(path = {"single", "tip", "", "tip/single"})
    public String singleTip(Model model)
    {
        String tip = bakingTips[3];
        model.addAttribute("singleTip", tip);

        return "single_tip";
    }

    //loads at http://localhost:8080/random
    @RequestMapping("random")
    public String randomTip()
    {
        return "random_tip";
    }
}
