package p7;

public class Book extends Library {
    private int numberOfPages;

    public Book(String title, String author, int numberOfPages) {
        super(title, author);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Pages: " + numberOfPages);
    }
}
