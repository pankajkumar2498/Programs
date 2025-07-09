package CollectionOperations.List;

import java.util.ArrayList;

public class ArrayListDemo {

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

    public static void main(String[] args) {

        ArrayList<Book> booklist = new ArrayList<>();

        booklist.add(new Book(101, "Prince of Persia", "Atharv", 450, "Action"));
        booklist.add(new Book(102, "Rich Dad Poor Dad", "Ananya", 550, "Adventure"));
        booklist.add(new Book(103, "GodZilla", "Pankaj", 400, "Horror"));
        booklist.add(new Book(104, "Avengers", "Atharv", 350, "Scifi"));
        booklist.add(new Book(105, "Mission Impossible", "Atharv", 510, "Action"));
        booklist.add(new Book(106, "Spiderman", "Bruce Lee", 555, "Action"));

        // System.out.println(booklist);

        // get full details of books by Author
        ArrayList<Book> booksByAuthor = new ArrayList<Book>();
        for (Book book : booklist) {
            if (book.getAuthor().equals("Pankaj")) {
                booksByAuthor.add(book);
            }
        }

        System.out.println("Details of Book By Author Name: ");
        for (Book book : booksByAuthor) {
            System.out.println(book);
        }
        
        // get only Title and author details by Category
        ArrayList<String> booksByCategory = new ArrayList<String>();
        for (Book book : booklist) {
            if (book.getCategory().equals("Action")) {
                booksByCategory.add("Title: " + book.title + ", Author: " + book.author + ", Price: " + book.getPrice());
            }
        }
        
        System.out.println("Details of Book By Category: ");
        for (String category : booksByCategory) {
            System.out.println(category + " ");
        }

        // get full details of Book whose price > 500 & Category starts with "A"
        ArrayList<Book> booksByPrice = new ArrayList<Book>();
        for(Book book : booklist){
            if(book.getPrice() > 500 && book.getCategory().startsWith("A")){
                booksByPrice.add(book);
            }
        }

        for (Book book : booksByPrice) {
            System.out.println(book);
        }

    }

}
