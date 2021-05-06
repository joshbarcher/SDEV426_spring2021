package edu.greenriver.sdev.video_uploader.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class VideoUpload
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int uploadId;

    private String url;
    private int length;
    private boolean favorited;

    //there is a one-to-one relationship with authors
    @OneToOne
    @JoinColumn(name = "authorId")
    private VideoAuthor author;
}
