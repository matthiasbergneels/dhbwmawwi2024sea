package excersises.chapter5.laptop;

public class LaptopTest {
  public static void main(String[] args) {
    // Erstellen von Laptop-Objekten
    Laptop laptop1 = new Laptop();
    Laptop laptop2 = new Laptop("Dell", "Intel i7");
    Laptop laptop3 = new Laptop("Razer", "AMD Ryzen 9", 16, LaptopCategory.GAMING);

    // Ausgabe der Details
    laptop1.printDetails();
    laptop2.printDetails();
    laptop3.printDetails();
  }
}
