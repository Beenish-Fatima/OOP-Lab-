package LabAssignment.LibraryManagementSystem;


import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        books.add(book);
    }

    public void checkOutBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isCheckedOut()) {
                book.checkOut();
                System.out.println("Checked out: " + book);
                return;
            }
        }
        System.out.println("Book not available for checkout.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isCheckedOut()) {
                book.checkIn();
                System.out.println("Returned: " + book);
                return;
            }
        }
        System.out.println("Book cannot be returned.");
    }

    public void listAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : books) {
            if (!book.isCheckedOut()) {
                System.out.println(book);
            }
        }
    }
}

