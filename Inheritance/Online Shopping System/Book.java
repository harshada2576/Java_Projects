package p10;

public class Book extends Product {
    private String author;

    public Book(String productId, String name, double price, String author) {
        super(productId, name, price);
        this.author = author;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Author: " + author);
    }
}
