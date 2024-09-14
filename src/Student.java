import java.util.List;

public class Student extends User {
    private int studentId;
    private List<Book> borrowedBooks;

    public Student(int userId, String name, String email, String password, int studentId) {
        super(userId, name, email, password);
        this.studentId = studentId;
        // Initialize borrowedBooks as needed
    }

    // Getters and Setters
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    // Methods for borrowing and returning books
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
            // Additional logic as needed
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.setAvailable(true);
            // Additional logic as needed
        }
    }

    @Override
    public void login() {
        // Implementation for student login
    }

    @Override
    public void logout() {
        // Implementation for student logout
    }
}