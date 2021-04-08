package edu.greenriver.sdev.di_example.model.shelves;

import edu.greenriver.sdev.di_example.model.books.Book;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class DigitalBookShelf implements IBookShelf
{
    public DigitalBookShelf()
    {
        System.out.println();
    }

    public void add(Book book)
    {
        System.out.println("Book added to digital shelf");
    }

    public boolean remove(Book book)
    {
        //do something...
        return false;
    }

    public boolean contains(Book book)
    {
        //do something...
        return false;
    }
}
