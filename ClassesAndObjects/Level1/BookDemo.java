package ClassesAndObjects.Level1;
// Book class
class Book {
    // Attributes
    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }
}
public class BookDemo {
    public static void main(String[] args) {
          // Create Book objects
        Book b1 = new Book("The Alchemist", "Paulo Coelho", 350.0);
        Book b2 = new Book("Atomic Habits", "James Clear", 499.0);

        // Display book details
        b1.displayDetails();
        System.out.println();
        b2.displayDetails();
    }
}
