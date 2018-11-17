package com.krishna.javaexample.compositon;

import java.util.ArrayList;
import java.util.List;

/**
 * Composition
 * 
 * part-of relationship
 * both entities are dependent on each other
 * when there is a composition between two entities, the composed object cannot exist without the other entity
 */
public class CompositionMain {
    public void CompRun() {
        Book bookOne = new Book("Effective Java", "Joshua Bloch");
        Book bookTwo = new Book("Thinking in Java", "Bruce Eckel");
        Book bookThree = new Book("Java: The Complete Reference", "Herbert Schildt");
    
        List<Book> books = new ArrayList<Book>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);
        
        Library library = new Library(books);

        List<Book> book = library.getTotalBooksInLibrary();
        for (Book b : book) {
            System.out.println("Title : " + b.title + " and Author : " + b.author);
        }
        
    }
}