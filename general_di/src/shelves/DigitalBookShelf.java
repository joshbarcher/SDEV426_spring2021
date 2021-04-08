package shelves;

import books.Book;

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
