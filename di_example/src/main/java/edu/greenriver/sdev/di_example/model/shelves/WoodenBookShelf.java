package edu.greenriver.sdev.di_example.model.shelves;

import edu.greenriver.sdev.di_example.model.books.Book;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class WoodenBookShelf implements IBookShelf
{
    public WoodenBookShelf()
    {
        System.out.println();
    }

    public void add(Book book)
    {
        System.out.println("Book added to wooden shelf");
    }

    public boolean remove(Book book)
    {
        return false;
    }

    public boolean contains(Book book)
    {
        return false;
    }
}
