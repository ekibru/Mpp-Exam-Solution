import java.util.*;

public class Library {
    private ArrayList<Book> books;
    
    public Library() {
        this.books = new ArrayList<Book>();
    }
    
    public void addBook(Book book) {
        books.add(book);
    }
    
    public void removeBook(Book book) {
        books.remove(book);
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> results = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                results.add(book);
            }
        }
        return results;
    }
    
    public ArrayList<Book> searchByAuthor(String author) {
        ArrayList<Book> results = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                results.add(book);
            }
        }
        return results;
    }
    
    public ArrayList<Book> searchByISBN(String isbn) {
        ArrayList<Book> results = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getISBN().equals(isbn)) {
                results.add(book);
            }
        }
        return results;
    }
}

