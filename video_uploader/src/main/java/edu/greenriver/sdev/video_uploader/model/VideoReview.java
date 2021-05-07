package edu.greenriver.sdev.video_uploader.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class VideoReview
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reviewId;

    private String reviewBody;

    //there is a one-to-one relationship with uploads
    @ManyToOne
    @JoinColumn(name = "uploadId")
    private VideoUpload upload;
}
