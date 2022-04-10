package com;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    public List<Book> getBooks() {
        List<Book> book = new ArrayList<>();
        book.add(new Book(123, "java", 300));
        book.add(new Book(321, "php", 330));
        book.add(new Book(435, "Angular", 350));
        book.add(new Book(432, "react", 380));
        return book;
    }
}
