package edu.greenriver.sdev.video_uploader.repositories;

import edu.greenriver.sdev.video_uploader.model.VideoUpload;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//this is a data layer for VideoUpload objects!
@Repository
public interface IVideoUploadRepository extends JpaRepository<VideoUpload, Integer>
{
    List<VideoUpload> findAllByFavoritedEquals(boolean favorited);

    //get all URLs that start with a string (youtube.com...) ordered by url descending
    List<VideoUpload> findAllByUrlStartingWithOrderByUrlDesc(String start);
}
