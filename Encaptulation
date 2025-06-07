import java.util.*;

class Book {
    public List<String> title;
    public List<String> author;
    private List<Boolean> isAvailable;

    // Parameterized constructor
    public Book(List<String> title, List<String> author, List<Boolean> isAvailable) {
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    // Method to borrow a book
    public void borrowBook(String bookName) {
        for (int i = 0; i < title.size(); i++) {
            if (title.get(i).equals(bookName)) {
                if (isAvailable.get(i)) {
                    isAvailable.set(i, false);
                } else {
                    System.out.println("Book is not available.");
                }
                return;
            }
        }
    }

    // Method to return a book
    public void returnBook(String bookName) {
        for (int i = 0; i < title.size(); i++) {
            if (title.get(i).equals(bookName)) {
                isAvailable.set(i, true);
                return;
            }
        }
    }

    // Method to get availability
    public void getAvailability(String bookName) {
        for (int i = 0; i < title.size(); i++) {
            if (title.get(i).equals(bookName)) {
                System.out.println(isAvailable.get(i));
                return;
            }
        }
    }
}
