import p7.*;
import java.util.Scanner;

public class S7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Book Title: ");
        String bookTitle = scanner.nextLine();
        System.out.print("Enter Book Author: ");
        String bookAuthor = scanner.nextLine();
        System.out.print("Enter Number of Pages: ");
        int pages = scanner.nextInt();
        Book book = new Book(bookTitle, bookAuthor, pages);

        scanner.nextLine(); // Consume newline
        System.out.print("\nEnter DVD Title: ");
        String dvdTitle = scanner.nextLine();
        System.out.print("Enter DVD Author: ");
        String dvdAuthor = scanner.nextLine();
        System.out.print("Enter Duration (minutes): ");
        int duration = scanner.nextInt();
        DVD dvd = new DVD(dvdTitle, dvdAuthor, duration);

        System.out.println("\nLibrary Items:");
        book.displayDetails();
        System.out.println();
        dvd.displayDetails();

        scanner.close();
    }
}
