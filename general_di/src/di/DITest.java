package di;

import books.Book;
import books.BookCollection;
import shelves.DigitalBookShelf;
import shelves.IBookShelf;
import shelves.WoodenBookShelf;

public class DITest
{
    public static void main(String[] args)
    {
        //we need to inject the object that BookCollection needs to do it's job
        IBookShelf shelf = new DigitalBookShelf();
        IBookShelf anotherShelf = new WoodenBookShelf();

        //does BookCollection care what type of shelf?
        BookCollection collection = new BookCollection(anotherShelf);

        collection.addBookToShelf(new Book("0-09-112100-0", "The Elric Saga", "Michael Moorcock"),
                                  new Book("0-571-05686-5", "Lord of the Flies", "William Golding"),
                                  new Book("", "", ""));
    }
}
