package edu.greenriver.sdev.video_uploader.repositories;

import edu.greenriver.sdev.video_uploader.model.VideoReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReviewRepository extends JpaRepository<VideoReview, Integer>
{
}
