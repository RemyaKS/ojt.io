import java.util.ArrayList;
import java.util.List;

// Book class
class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean available;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = true; // Initially set to available
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}

// Abstract class Member (abstracting common behaviors)
abstract class Member {
    private String name;
    private String memberId;
    private List<Book> borrowedBooks;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public abstract void borrowBook(Book book);

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setAvailable(true);
            System.out.println(getName() + " has returned " + book.getTitle());
        } else {
            System.out.println(getName() + " did not borrow " + book.getTitle());
        }
    }
}

// RegularMember class extending Member
class RegularMember extends Member {
    private static final int MAX_BOOKS_ALLOWED = 5; // Maximum books a regular member can borrow

    public RegularMember(String name, String memberId) {
        super(name, memberId);
    }

    @Override
    public void borrowBook(Book book) {
        List<Book> borrowedBooks = getBorrowedBooks();
        if (borrowedBooks.size() < MAX_BOOKS_ALLOWED) {
            if (book.isAvailable()) {
                borrowedBooks.add(book);
                book.setAvailable(false);
                System.out.println(getName() + " has borrowed " + book.getTitle());
            } else {
                System.out.println(book.getTitle() + " is not available.");
            }
        } else {
            System.out.println("Sorry, " + getName() + " cannot borrow more than " + MAX_BOOKS_ALLOWED + " books.");
        }
    }
}

// PremiumMember class extending Member
class PremiumMember extends Member {
    private static final int MAX_BOOKS_ALLOWED = 10; // Maximum books a premium member can borrow

    public PremiumMember(String name, String memberId) {
        super(name, memberId);
    }

    @Override
    public void borrowBook(Book book) {
        List<Book> borrowedBooks = getBorrowedBooks();
        if (borrowedBooks.size() < MAX_BOOKS_ALLOWED) {
            if (book.isAvailable()) {
                borrowedBooks.add(book);
                book.setAvailable(false);
                System.out.println(getName() + " has borrowed " + book.getTitle());
            } else {
                System.out.println(book.getTitle() + " is not available.");
            }
        } else {
            System.out.println("Sorry, " + getName() + " cannot borrow more than " + MAX_BOOKS_ALLOWED + " books.");
        }
    }
}

// Library class
class Library {
    private List<Book> books;
    private List<Member> members;

    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void borrowBook(Member member, Book book) {
        if (books.contains(book) && book.isAvailable()) {
            member.borrowBook(book);
        } else if (!book.isAvailable()) {
            System.out.println(book.getTitle() + " is not available for borrowing.");
        } else {
            System.out.println(book.getTitle() + " is not in the library.");
        }
    }

    public void returnBook(Member member, Book book) {
        member.returnBook(book);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create some books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780142437088");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084");
        Book book3 = new Book("1984", "George Orwell", "9780451524935");

        // Create a regular member and a premium member
        Member regularMember = new RegularMember("Niha", "M001");
        Member premiumMember = new PremiumMember("Nila", "PM001");

        // Create a library
        Library library = new Library();

        // Add books and members to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.addMember(regularMember);
        library.addMember(premiumMember);

        // Regular member borrows books
        library.borrowBook(regularMember, book1);
        library.borrowBook(regularMember, book2);
        library.borrowBook(regularMember, book3);

        // Premium member borrows books
        library.borrowBook(premiumMember, book1); // This will fail since book1 is already borrowed
        library.borrowBook(premiumMember, book2); // This will fail since book2 is already borrowed
        library.borrowBook(premiumMember, book3); // This will fail since book3 is already borrowed

        // Return some books
        library.returnBook(regularMember, book1);

        // Premium member borrows books after return
        library.borrowBook(premiumMember, book1); // This will succeed now
    }
}
