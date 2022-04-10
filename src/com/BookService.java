package com;



import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

//    @Override
//    public int compare(Book o1, Book o2) {
//        return o1.getBookName().compareTo(o2.getBookName());
//    }
//})


       public List<Book> getBooksinSort() {
           List<Book> book = new BookDAO().getBooks();
        Collections.sort(book,(o1,o2)-> o1.getBookName().compareTo(o2.getBookName()));
        return book;
    }

    public static void main(String[] args) {
        System.out.println(new BookService().getBooksinSort());
    }
}

/*class  MyComparator implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getBookName().compareTo(o2.getBookName());
    }
}*/
