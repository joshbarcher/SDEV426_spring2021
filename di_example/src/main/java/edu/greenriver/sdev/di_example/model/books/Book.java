package edu.greenriver.sdev.di_example.model.books;

public class Book
{
    private String isbn;
    private String author;
    private String title;

    public Book(String isbn, String author, String title)
    {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString()
    {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
