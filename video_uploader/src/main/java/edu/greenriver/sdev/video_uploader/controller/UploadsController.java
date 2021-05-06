package edu.greenriver.sdev.video_uploader.controller;

import edu.greenriver.sdev.video_uploader.services.UploadsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("videos")
public class UploadsController
{
    private UploadsService service;

    //this will be injected automatically by Spring
    public UploadsController(UploadsService service)
    {
        this.service = service;
    }

    @RequestMapping("uploads")
    public String uploads(Model model)
    {
        model.addAttribute("uploads", service.getUploads());
        return "uploads";
    }
}
