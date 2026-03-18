package exercices.basics.books_system;

// Final class
public final class Ebook extends LibraryItem {

    private double fileSize;

    // Constructor calling parent constructor
    public Ebook(String title, String author, double fileSize) {
        super(title, author, "Digital");
        this.fileSize = fileSize;
    }

    // Override to add specific behavior
    @Override
    public void displayInfo() {
        displayBasicInfo();
        System.out.println("File size: " + fileSize + " MB");
        System.out.println("===================");
    }
}