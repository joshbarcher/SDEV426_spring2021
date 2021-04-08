package books;

import shelves.IBookShelf;

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

