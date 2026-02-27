class Book {
    String title;
    String author;
    double price;

    // Constructor
    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // Method to display details
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class Bookclass {
    public static void main(String[] args) {

        // Creating two objects
        Book book1 = new Book("Wings of Fire", "A.P.J. Abdul Kalam", 350.0);
        Book book2 = new Book("The Alchemist", "Paulo Coelho", 299.0);

        // Displaying details
        book1.display();
        book2.display();
    }
}