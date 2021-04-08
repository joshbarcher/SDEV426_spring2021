package edu.greenriver.sdev.di_example;

import edu.greenriver.sdev.di_example.model.books.Book;
import edu.greenriver.sdev.di_example.model.books.BookCollection;
import edu.greenriver.sdev.di_example.model.books.Library;
import edu.greenriver.sdev.di_example.model.shelves.IBookShelf;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiExampleApplication
{
    public static void main(String[] args)
    {
        //get the Spring container (the IoC container, aka the "context")
        ApplicationContext context = SpringApplication.run(DiExampleApplication.class, args);

        //access the objects stored and managed by our container
        IBookShelf shelf = context.getBean(IBookShelf.class);
        IBookShelf anotherDigital = context.getBean(IBookShelf.class);

/*      WoodenBookShelf anotherShelf = context.getBean(WoodenBookShelf.class);
        anotherShelf.add(new Book("0-571-05686-5", "Lord of the Flies", "William Golding"));*/

        BookCollection collection = context.getBean(BookCollection.class);
        collection.addBookToShelf(new Book("0-09-112100-0", "The Elric Saga", "Michael Moorcock"));

        Library library = context.getBean(Library.class);
        System.out.println(library);
    }
}
