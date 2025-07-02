package CollectionOperations;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Note 1: For using Comparator, we have to make separate class that implements Comparator class separately\
// Note 2: If you don't wan't to use Separate class, then go for (Lambda function) of Comparator(o1, o2) with two parameters, first parameter is: list (want to sort), & Second Parameter: Lamabda Expression

public class ComparatorDemo {

    public static class Book {

        int BookId;
        String title;
        String author;
        int price;
        String category;

        public Book(int bookId, String title, String author, int price, String category) {
            this.BookId = bookId;
            this.title = title;
            this.author = author;
            this.price = price;
            this.category = category;
        }

        public int getBookId() {
            return BookId;
        }

        public void setBookId(int bookId) {
            BookId = bookId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        @Override
        public String toString() {
            return "Book [BookId=" + BookId + ", title=" + title + ", author=" + author + ", price=" + price
                    + ", category="
                    + category + "]";
        }

    }

    // TitleSort class that implements Comparator class separately
    public static class TitleSort implements Comparator<Book> {

        @Override
        public int compare(Book o1, Book o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }

    }

    // AuthorSort class that implements Comparator class separately
    public static class AuthorSort implements Comparator<Book> {

        @Override
        public int compare(Book o1, Book o2) {
            return o1.getAuthor().compareTo(o2.getAuthor());
        }
    }

    // PriceSort class that implements Comparator class separately
    public static class PriceSort implements Comparator<Book> {
        @Override
        public int compare(Book o1, Book o2) {
            Double tprice = (double) o1.getPrice();
            Double oprice = (double) o2.getPrice();
            return tprice.compareTo(oprice);
        }
    }

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book(101, "Prince of Persia", "Atharv", 450, "Action"),
                new Book(102, "Rich Dad Poor Dad", "Ananya", 550, "Adventure"),
                new Book(103, "GodZilla", "Pankaj", 400, "Horror"),
                new Book(104, "Avengers", "Atharv", 350, "Scifi"),
                new Book(105, "Mission Impossible", "Atharv", 510, "Action"),
                new Book(106, "Spiderman", "Bruce Lee", 555, "Action"));

        // for (Book book : books) {
        //     System.out.println(book);
        // }

        // Note 1: Sort using Different classes that implements Comparator separately
        // System.out.println("Sorting by Title of Book: ");
        // Collections.sort(books, new TitleSort()); // sort by Title of the book
        // for (Book book : books) {
        //     System.out.println(book);
        // }

        // System.out.println("Sorting by Name of Author: ");
        // Collections.sort(books, new AuthorSort()); // sort by Author name

        // for (Book book : books) {
        //     System.out.println(book);
        // }

        // System.out.println("Sorting by Price of Book: ");
        // Collections.sort(books, new PriceSort()); // sort by Price of Book

        // for (Book book : books) {
        //     System.out.println(book);
        // }

        // Note 2: Sort using Lambda Function Comparator


        System.out.println("\nSorting by Title of Book: ");
        Comparator<Book> comp1 = (o1, o2)->{
            return o1.getTitle().compareTo(o2.getTitle());
        };

        Collections.sort(books, comp1);

        for (Book book : books) {
            System.out.println(book);
        }
       
        System.out.println("\nSorting by Name of Author: ");
        
        Collections.sort(books, (o1, o2)->{
            return o1.getAuthor().compareTo(o2.getAuthor());
        });

        for (Book book : books) {
            System.out.println(book);
        }
        
        System.out.println("\nSorting by Price of Book: ");
        
        Collections.sort(books, (o1, o2)->{
            Double tprice = (double) o1.getPrice();
            Double oprice = (double) o2.getPrice();
            return tprice.compareTo(oprice);
        });

        for (Book book : books) {
            System.out.println(book);
        }
        
    }

}
