package edu.greenriver.sdev.securitydemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController
{
    //http://localhost:8081/user/page
    @GetMapping("user/page")
    public String loadUser()
    {
        return "user_page";
    }

    @GetMapping("admin/page")
    public String loadAdmin()
    {
        return "admin_page";
    }

    @GetMapping("guest/page")
    public String loadGuest()
    {
        return "guest_page";
    }
}
