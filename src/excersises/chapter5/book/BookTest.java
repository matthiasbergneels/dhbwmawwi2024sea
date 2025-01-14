package excersises.chapter5.book;

public class BookTest {
  public static void main(String[] args) {
    Book book1 = new Book("1984", "George Orwell", 328, 15.99);
    Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 281, 10.99);
    Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 180, 12.99);

    // Ausgabe der Details aller Bücher
    book1.printDetails();
    book2.printDetails();
    book3.printDetails();

    System.out.println("Gesamtanzahl von erstellten Büchern: " + Book.getBookCount());
  }
}
