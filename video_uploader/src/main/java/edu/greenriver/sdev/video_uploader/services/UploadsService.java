package edu.greenriver.sdev.video_uploader.services;

import edu.greenriver.sdev.video_uploader.model.VideoUpload;
import edu.greenriver.sdev.video_uploader.repositories.IUploadRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/* BUSINESS LOGIC GOES HERE!!!! */
@Service
public class UploadsService
{
    private IUploadRepository repo;

    //this will be injected automatically by Spring
    public UploadsService(IUploadRepository repo)
    {
        this.repo = repo;
    }

    public List<VideoUpload> getUploads()
    {
        return repo.findAll();
    }

    public VideoUpload getUploadById(int id)
    {
        return repo.findById(id).get();
    }

    public void addVideo(VideoUpload blankVideo)
    {
        repo.save(blankVideo);
    }

    public List<VideoUpload> getFavoritedVideos()
    {
        return repo.findAllByFavoritedEquals(true);
    }

    public List<VideoUpload> getYoutubeVideos()
    {
        return repo.findAllByUrlStartingWithOrderByUrlDesc(
                "http://www.youtube.com");
    }
}
