package com.twu29.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> allBooks = new ArrayList<Book>();

    public Library() {
        createAllBooks();
    }

    public void createAllBooks(){
        for (int i = 0; i < 4; i++){
            allBooks.add(new Book("Book " + String.valueOf(i) + " ID"));
        }
    }

    public String listOfAllBooks() {

        StringBuilder list = new StringBuilder();
        for (Book book : allBooks){
             list.append(String.valueOf(allBooks.indexOf(book)+1) + ". "+ book.getId() + "\n");
        }
        return list.toString();
    }
}
