package edu.greenriver.sdev.video_uploader.services;

import edu.greenriver.sdev.video_uploader.model.VideoUpload;
import edu.greenriver.sdev.video_uploader.repositories.IVideoUploadRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UploadsService
{
    private IVideoUploadRepository repo;

    //this will be injected automatically by Spring
    public UploadsService(IVideoUploadRepository repo)
    {
        this.repo = repo;
    }

    public List<VideoUpload> getUploads()
    {
        return repo.findAll();
    }
}
