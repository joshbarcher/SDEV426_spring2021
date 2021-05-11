package model;

import java.time.LocalDate;
import java.util.UUID;

/* this is the "product" class, that we need a builder to help
   instantiate.
 */
public class Note
{
    private UUID noteId;
    private String author;
    private String body;
    private LocalDate createdOn;
    private LocalDate updatedOn;

    public Note(String author, String body,
                LocalDate createdOn, LocalDate updatedOn)
    {
        //each Note is automatically assigned a random id
        this.noteId = UUID.randomUUID();

        this.author = author;
        this.body = body;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    public UUID getNoteId()
    {
        return noteId;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getBody()
    {
        return body;
    }

    public LocalDate getCreatedOn()
    {
        return createdOn;
    }

    public LocalDate getUpdatedOn()
    {
        return updatedOn;
    }

    @Override
    public String toString()
    {
        return "Note{" +
                "noteId=" + noteId +
                ", author='" + author + '\'' +
                ", body='" + body + '\'' +
                ", createdOn=" + createdOn +
                ", updatedOn=" + updatedOn +
                '}';
    }
}
