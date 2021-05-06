package edu.greenriver.sdev.video_uploader.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class VideoAuthor
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int authorId;
    private String name;

    //there is a one-to-one relationship with uploads
    @OneToOne(mappedBy = "author")
    private VideoUpload upload;
}
