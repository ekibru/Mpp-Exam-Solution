import java.util.*;

public class LibraryTest {
    public static void main(String[] args) {
        // Create some books
        Book book1 = new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", "9780747532743");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");
        Book book3 = new Book("Pride and Prejudice", "Jane Austen", "9780486284736");
        
        // Create a library
        Library library = new Library();
        
        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        
        // Search for books
        ArrayList<Book> results = library.searchByTitle("Harry Potter and the Philosopher's Stone");
        System.out.println("Search results:");
        for (Book book : results) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("ISBN: " + book.getISBN());
        }
        
        // Create a user
        User user = new User("Alice", "1234");
        
        // Borrow a book
        Borrow borrow = new Borrow(user, book1);
        borrow.borrow();
        
        // Return a book
        borrow.returnBook();
    }
}
