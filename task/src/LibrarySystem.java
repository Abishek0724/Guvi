import java.util.*;
//book class
class Book{
    int bookid;
    String bookname;
    String author;
    boolean isavailable;
    public Book(int bookid,String bookname,String author,boolean isavailable){
        this.bookid=bookid;
        this.bookname=bookname;
        this.author=author;
        this.isavailable=isavailable;
    }
    public void displayBook(){
        System.out.println("Book id:"+bookid+"Title:"+bookname+"Author:"+author+"Available:"+isavailable);
    }

}
//library class
class Library{
    ArrayList<Book>books=new ArrayList<>();
    public void addbook(Book book){
            books.add(book);
            System.out.println("Book added sucessfully");
    }
    public void removebook(int bookid){
        boolean removed = books.removeIf(book->book.bookid==bookid);
        if(removed){
            System.out.println("Book removed sucessfully");
        }else{
            System.out.println("Book not found");
        }
    }
    public void searchbook(int bookid){
        for (Book book : books) {
            if(book.bookid==bookid){
                System.out.println("Book found");
                book.displayBook();
                return;
            }
        }
        System.out.println("Book not found");

    }
    public void displayBooks(){
        for(Book book:books){
            book.displayBook();
        }
    }

}
public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Library library=new Library();
        while (true) { 
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    System.out.print("Is Available (true/false): ");
                    boolean isAvailable = sc.nextBoolean();
                    library.addbook(new Book(id, title, author, isAvailable));
                }
                case 2 -> {
                    System.out.print("Enter Book ID to remove: ");
                    int removeId = sc.nextInt();
                    library.removebook(removeId);
                }
                case 3 -> {
                    System.out.print("Enter Book ID to search: ");
                    int searchId = sc.nextInt();
                    library.searchbook(searchId);
                }
                case 4 -> library.displayBooks();
                case 5 -> {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice!");
        }
    }

    }
}
