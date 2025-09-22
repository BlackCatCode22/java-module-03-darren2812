// Driver.java
// dD 09/21/2025

public class Driver {
    public static void main(String[] args) {
        MyStuff book = new MyStuff("Harry Potter", "J.K. Rowling", 35235, 1999);
        System.out.println("This is your book information: ");
        System.out.println("Title: " + book.title + " Author: " + book.author
                + " Number of Pages: " + book.numberOfPages + " Release Date: " + book.releaseDate);
    }
}