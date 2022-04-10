package com;



import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

       public List<Book> getBooksinSort() {
           List<Book> book = new BookDAO().getBooks();
        Collections.sort(book,(o1,o2)-> o1.getBookName().compareTo(o2.getBookName()));
        return book;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBooksinSort());
    }
}

