package edu.greenriver.sdev.video_uploader.controller;

import edu.greenriver.sdev.video_uploader.model.VideoUpload;
import edu.greenriver.sdev.video_uploader.services.UploadsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        model.addAttribute("uploads", service.getYoutubeVideos());
        return "uploads";
    }

    @RequestMapping("{id}")
    public String uploadById(@PathVariable int id, Model model)
    {
        model.addAttribute("upload", service.getUploadById(id));
        return "upload_by_id";
    }

    @GetMapping("add")
    public String addVideoForm(Model model)
    {
        model.addAttribute("blankVideo", new VideoUpload());
        return "add_video";
    }

    @PostMapping("add")
    public String handleAddVideoForm(@ModelAttribute VideoUpload blankVideo)
    {
        service.addVideo(blankVideo);
        return "redirect:/videos/uploads";
    }
}
