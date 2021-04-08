package edu.greenriver.sdev.di_example.model.books;

import edu.greenriver.sdev.di_example.model.shelves.IBookShelf;
import org.springframework.stereotype.Component;

@Component
public class BookCollection
{
    private IBookShelf shelf;

    public BookCollection(IBookShelf shelf)
    {
        this.shelf = shelf;
    }

    public void addBookToShelf(Book... books)
    {
        for (Book book : books)
        {
            shelf.add(book);
        }
    }

    public void setShelf(IBookShelf shelf)
    {
        this.shelf = shelf;
    }

    public IBookShelf getShelf()
    {
        return shelf;
    }
}

