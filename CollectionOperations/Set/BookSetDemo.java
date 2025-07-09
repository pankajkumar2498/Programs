package CollectionOperations.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import CollectionOperations.List.ArrayListDemo.Book;

public class BookSetDemo {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book(101, "Prince of Persia", "Atharv", 450, "Action"),
                new Book(102, "Rich Dad Poor Dad", "Ananya", 550, "Adventure"),
                new Book(103, "GodZilla", "Pankaj", 400, "Horror"),
                new Book(104, "Avengers", "Atharv", 350, "Scifi"),
                new Book(105, "Mission Impossible", "Atharv", 510, "Action"),
                new Book(106, "Spiderman", "Bruce Lee", 555, "Action"));

        Set<Book> bookset = new HashSet<>(books);
        System.out.println(bookset);    // print all Books in one line
        
        for (Book book : bookset) {
        System.out.println(book);   
        }


        Set<Book> booksets = new LinkedHashSet<>(books);
        
        for (Book book : booksets) {
        System.out.println(book);   
        }

    }
}
