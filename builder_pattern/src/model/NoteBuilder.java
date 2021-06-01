package model;

import java.time.LocalDate;

/* This is a builder that makes it easier to create "product" objects */
public class NoteBuilder
{
    private String author;
    private String body;
    private LocalDate createdOn;
    private LocalDate updatedOn;

    public NoteBuilder()
    {
        //do nothing...
    }

    /* each of the setter methods in the builder should return the builder */
    public NoteBuilder author(String author)
    {
        this.author = author;
        return this;
    }

    public NoteBuilder body(String body)
    {
        this.body = body;
        return this;
    }

    public NoteBuilder createdOn(LocalDate createdOn)
    {
        this.createdOn = createdOn;
        return this;
    }

    public NoteBuilder updatedOn(LocalDate updatedOn)
    {
        this.updatedOn = updatedOn;
        return this;
    }

    public Note build()
    {
        return new NoteBuilderIntelliJ().setAuthor(author).setBody(body).setCreatedOn(createdOn).setUpdatedOn(updatedOn).createNote();
    }

    public Note buildWithDefaults()
    {
        //set defaults
        if (createdOn == null)
        {
            createdOn = LocalDate.now();
        }

        if (updatedOn == null)
        {
            updatedOn = LocalDate.now();
        }

        return new NoteBuilderIntelliJ().setAuthor(author).setBody(body).setCreatedOn(createdOn).setUpdatedOn(updatedOn).createNote();
    }
}
