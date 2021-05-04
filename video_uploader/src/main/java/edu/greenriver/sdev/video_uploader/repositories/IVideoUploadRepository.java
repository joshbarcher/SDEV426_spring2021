package edu.greenriver.sdev.video_uploader.repositories;

import edu.greenriver.sdev.video_uploader.model.VideoUpload;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//this is a data layer for VideoUpload objects!
@Repository
public interface IVideoUploadRepository extends JpaRepository<VideoUpload, Integer>
{
}
