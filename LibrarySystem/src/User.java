import java.util.*;

public class User {
    private String name;
    private String id;
    private ArrayList<Book> borrowingHistory;
    
    public User(String name, String id) {
        this.name = name;
        this.id = id;
        this.borrowingHistory = new ArrayList<Book>();
    }
    
    public void borrowBook(Book book) {
        borrowingHistory.add(book);
    }
    
    public void returnBook(Book book) {
        borrowingHistory.remove(book);
    }
}

