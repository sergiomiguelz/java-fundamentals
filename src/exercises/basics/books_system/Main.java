package exercises.basics.books_system;

public class Main {
    public static void main(String[] args) {

        // Creating array with polymorphism
        LibraryItem[] items = {
                new Ebook("Otelo", "William Shakespeare", 13),
                new PhysicalBook("Dom Casmurro", "Machado de Assis", 256)
        };

        // Loop through items and display info
        for (LibraryItem item : items) {
            item.displayInfo();
        }
    }
}
