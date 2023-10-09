package LabAssignment.LibraryManagementSystem;


import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        // Add books to the library
        library.addBook("The Great Gatsby", "F. Scott Fitzgerald");
        library.addBook("To Kill a Mockingbird", "Harper Lee");
        library.addBook("1984", "George Orwell");

        // List available books
        library.listAvailableBooks();
//
//        // Check out a book
//        library.checkOutBook("To Kill a Mockingbird");
//
//        // List available books after checkout
//        library.listAvailableBooks();
//
//        // Return a book
//        library.returnBook("To Kill a Mockingbird");
//
//        // List available books after return
//        library.listAvailableBooks();
    }
}

