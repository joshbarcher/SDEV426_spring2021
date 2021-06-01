package model;

import java.time.LocalDate;

public class NoteBuilderIntelliJ
{
    private String author;
    private String body;
    private LocalDate createdOn;
    private LocalDate updatedOn;

    public NoteBuilderIntelliJ setAuthor(String author)
    {
        this.author = author;
        return this;
    }

    public NoteBuilderIntelliJ setBody(String body)
    {
        this.body = body;
        return this;
    }

    public NoteBuilderIntelliJ setCreatedOn(LocalDate createdOn)
    {
        this.createdOn = createdOn;
        return this;
    }

    public NoteBuilderIntelliJ setUpdatedOn(LocalDate updatedOn)
    {
        this.updatedOn = updatedOn;
        return this;
    }

    public Note createNote()
    {
        return new Note(author, body, createdOn, updatedOn);
    }
}