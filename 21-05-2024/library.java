import java.util.ArrayList;
public class library{
    ArrayList<String> books=new ArrayList<>();

    public void addBook(String book){
        books.add(book);
    }
    public void removeBook(String book){
        books.remove(book);
    }
    public  void displayBooks(){
        for(String book:books){
            System.out.println(book);
        }
    }
    public static void main(String[] args){
        library library=new library();
        library.addBook("book1");
        library.addBook("book2");
        library.addBook("book3");
        library.displayBooks();

        library.removeBook("book1");
        library.displayBooks();
    }
}