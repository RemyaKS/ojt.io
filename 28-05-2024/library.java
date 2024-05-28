class library{
    private String ISBN;
    private String title;
    private String author;
    private boolean isAvailable;
    public library(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.isAvailable = true; 
    }
public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed.");
        } else {
            System.out.println("Book unavailable.");
        }
    }
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned.");
        } else {
            System.out.println("Book was not borrowed.");
        }
    }
 public void displayDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable);
    }
     public static void main(String[] args) {
        library book = new library("25468", "A passage to india", "E. M Forster");
        book.displayDetails();
        book.borrowBook();
        book.displayDetails();
        book.borrowBook();
        book.returnBook();
        book.displayDetails();
        book.returnBook();
    }
}
