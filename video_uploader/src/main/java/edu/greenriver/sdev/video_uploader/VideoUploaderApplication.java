package edu.greenriver.sdev.video_uploader;

import edu.greenriver.sdev.video_uploader.model.VideoAuthor;
import edu.greenriver.sdev.video_uploader.model.VideoReview;
import edu.greenriver.sdev.video_uploader.model.VideoUpload;
import edu.greenriver.sdev.video_uploader.repositories.IAuthorRepository;
import edu.greenriver.sdev.video_uploader.repositories.IReviewRepository;
import edu.greenriver.sdev.video_uploader.repositories.IUploadRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;

@SpringBootApplication
public class VideoUploaderApplication
{
    public static void main(String[] args)
    {
        ApplicationContext springContainer = SpringApplication.run(VideoUploaderApplication.class, args);

        IUploadRepository videoRepo = springContainer.getBean(IUploadRepository.class);
        IAuthorRepository authorRepo = springContainer.getBean(IAuthorRepository.class);
        IReviewRepository reviewRepo = springContainer.getBean(IReviewRepository.class);

        //create two (transient) objects
        VideoUpload upload = new VideoUpload();
        upload.setLength(1000);
        upload.setFavorited(true);
        upload.setUrl("http://www.twitch.com/gandalf");

        //an author and some reviews
        VideoAuthor author = new VideoAuthor();
        author.setName("Josh Archer");

        VideoReview review1 = new VideoReview();
        review1.setReviewBody("Great video!");
        VideoReview review2 = new VideoReview();
        review2.setReviewBody("Awful, just plain awful. Please stop posting!");
        VideoReview review3 = new VideoReview();
        review3.setReviewBody("Meh...");

        //save the video and author
        videoRepo.save(upload);
        authorRepo.save(author);

        //save the reviews
        reviewRepo.save(review1);
        reviewRepo.save(review2);
        reviewRepo.save(review3);

        //connect them
        upload.setAuthor(author);
        author.setUpload(upload);

        upload.setReviews(new ArrayList<>());
        /*upload.getReviews().add(review1);
        upload.getReviews().add(review2);
        upload.getReviews().add(review3);*/
        review1.setUpload(upload);
        review2.setUpload(upload);
        review3.setUpload(upload);

        //save the video
        videoRepo.save(upload);

        //save our reviews after linking to the upload
        reviewRepo.save(review1);
        reviewRepo.save(review2);
        reviewRepo.save(review3);

        //try creating a new video using Lombok builders
        VideoUpload anotherUpload = VideoUpload.builder()
            .favorited(true)
            .length(100)
            .url("https://www.youtube.com/got")
            .build();
    }

    private static void test()
    {
        /*
        //retrieve our data-layer spring-beans
        IVideoUploadRepository uploadRepo = springContainer.getBean(IVideoUploadRepository.class);

        //save some database entities to the database

        //these are "transient" objects (not saved/persisted to the db)
        VideoUpload upload1 = new VideoUpload(0, "http://www.youtube.com/awesomevideo", 150, true);
        VideoUpload upload2 = new VideoUpload(0, "http://www.youtube.com/anothervideo", 30, false);

        //next we need to convert our objects to a "managed" state
        uploadRepo.save(upload1);
        uploadRepo.save(upload2);

        System.out.println("Saved db enties");
        System.out.println("Database has " + uploadRepo.count() + " records");

        upload1.setFavorited(false);
        uploadRepo.save(upload1);
         */
    }
}
