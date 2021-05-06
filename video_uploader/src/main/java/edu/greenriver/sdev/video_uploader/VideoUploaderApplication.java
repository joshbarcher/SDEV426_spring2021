package edu.greenriver.sdev.video_uploader;

import edu.greenriver.sdev.video_uploader.model.VideoAuthor;
import edu.greenriver.sdev.video_uploader.model.VideoUpload;
import edu.greenriver.sdev.video_uploader.repositories.IAuthorRepository;
import edu.greenriver.sdev.video_uploader.repositories.IVideoUploadRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.logging.Logger;

@SpringBootApplication
public class VideoUploaderApplication
{
    public static void main(String[] args)
    {
        ApplicationContext springContainer = SpringApplication.run(VideoUploaderApplication.class, args);

        IVideoUploadRepository videoRepo = springContainer.getBean(IVideoUploadRepository.class);
        IAuthorRepository authorRepo = springContainer.getBean(IAuthorRepository.class);

        //create two (transient) objects
        VideoUpload upload = new VideoUpload();
        upload.setLength(1000);
        upload.setFavorited(true);
        upload.setUrl("http://www.twitch.com/gandalf");

        VideoAuthor author = new VideoAuthor();
        author.setName("Josh Archer");

        //save the video
        videoRepo.save(upload);
        authorRepo.save(author);

        //connect them
        upload.setAuthor(author);
        author.setUpload(upload);

        //save the video
        videoRepo.save(upload);
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
