package exercices.basics.books_system;

// Final class
public final class PhysicalBook extends LibraryItem {

    private int pages;

    public PhysicalBook(String title, String author, int pages) {
        super(title, author, "Physical");
        this.pages = pages;
    }

    @Override
    public void displayInfo() {
        displayBasicInfo();
        System.out.println("Pages: " + pages);
        System.out.println("===================");
    }
}