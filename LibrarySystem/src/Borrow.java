public class Borrow {
    private User user;
    private Book book;
    
    public Borrow(User user, Book book) {
        this.user = user;
        this.book = book;
    }
    
    public void borrow() {
        user.borrowBook(book);
    }
    
    public void returnBook() {
        user.returnBook(book);
    }
}
