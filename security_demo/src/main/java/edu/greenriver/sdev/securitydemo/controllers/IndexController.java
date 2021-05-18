package edu.greenriver.sdev.securitydemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController
{
    //http://localhost:8081/user/page
    @GetMapping("user/page")
    public String loadIndex()
    {
        return "user_page";
    }
}
