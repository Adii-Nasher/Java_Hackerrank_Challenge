import java.util.Scanner;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}

class MyBook extends Book {
    int price;

    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    public void display() {
        System.out.println(
            "Title: " + this.title + "\n" +
            "Author: " + this.author + "\n" +
            "Price: " + this.price
        );
    }
}

public class Abook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the title of the book: ");
        String title = scanner.nextLine();

        System.out.print("Please enter the name of the author of the book: ");
        String author = scanner.nextLine();

        System.out.print("Please enter the price of the book: ");
        int price = scanner.nextInt();

        scanner.close();

        Book book = new MyBook(title, author, price);
        System.out.println("\nHere's the information you provided:\n");
        book.display();
    }
}
