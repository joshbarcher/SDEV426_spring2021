package edu.greenriver.sdev.video_uploader.repositories;

import edu.greenriver.sdev.video_uploader.model.VideoAuthor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthorRepository extends JpaRepository<VideoAuthor, Integer>
{
}
