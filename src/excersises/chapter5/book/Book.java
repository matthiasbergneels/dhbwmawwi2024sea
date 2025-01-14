package excersises.chapter5.book;

public class Book {
  private String title;
  private String author;
  private int pages;
  private double price;
  private static int bookCount = 0;

  // Konstruktor
  public Book(String title, String author, int pages, double price) {
    this.title = title;
    this.author = author;
    this.pages = pages;
    this.price = price;
    bookCount++;
  }

  // Statische Methode zum Abrufen der Buchanzahl
  public static int getBookCount() {
    return bookCount;
  }

  // Getter-Methoden
  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public int getPages() {
    return pages;
  }

  public double getPrice() {
    return price;
  }

  public void printDetails() {
    System.out.println("Buch Details:");
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Seitenanzahl: " + pages);
    System.out.println("Preis: €" + price);
    System.out.println();
  }
}
