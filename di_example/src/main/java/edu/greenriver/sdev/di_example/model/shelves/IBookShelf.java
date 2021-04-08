package edu.greenriver.sdev.di_example.model.shelves;

import edu.greenriver.sdev.di_example.model.books.Book;

public interface IBookShelf
{
    public void add(Book book);
    public boolean remove(Book book);
    public boolean contains(Book book);
}

