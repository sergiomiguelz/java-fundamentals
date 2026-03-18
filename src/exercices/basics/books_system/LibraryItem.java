package exercices.basics.books_system;

// Abstract base class
public abstract class LibraryItem {

    // Basic attributes
    protected String title;
    protected String author;
    protected final String type;

    // Constructor to initialize all common attributes
    protected LibraryItem(String title, String author, String type) {
        this.title = title;
        this.author = author;
        this.type = type;
    }

    // Method to display basic information
    public void displayBasicInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Type: " + type);
    }

    // Method to be overridden by subclasses
    public void displayInfo() {
        displayBasicInfo();
        System.out.println("===================");
    }
}