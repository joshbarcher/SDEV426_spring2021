package edu.greenriver.sdev.di_example.model.books;

import edu.greenriver.sdev.di_example.model.shelves.IBookShelf;
import edu.greenriver.sdev.di_example.model.shelves.WoodenBookShelf;
import org.springframework.stereotype.Component;

@Component
public class Library
{
    private WoodenBookShelf shelf1;
    private IBookShelf shelf2;

    public Library(WoodenBookShelf shelf1,
                   IBookShelf shelf2)
    {
        this.shelf1 = shelf1;
        this.shelf2 = shelf2;
    }

    public void addToShelf(int number, Book book)
    {
        if (number == 1)
        {
            shelf1.add(book);
        }
        else if (number == 2)
        {
            shelf2.add(book);
        }
    }
}










