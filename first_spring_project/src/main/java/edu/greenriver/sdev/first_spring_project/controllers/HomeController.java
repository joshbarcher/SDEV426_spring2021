package edu.greenriver.sdev.first_spring_project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This class will contain routes to different pages in our site.
 *
 * /home - will lead to our home page
 * /jokes/single - will lead to a joke
 */
@Controller
public class HomeController
{
    @RequestMapping("home")
    public String showHomePage()
    {
        return "index";
    }

    @RequestMapping("jokes/single")
    public String showJokePage()
    {
        return "jokes/single_joke";
    }
}
