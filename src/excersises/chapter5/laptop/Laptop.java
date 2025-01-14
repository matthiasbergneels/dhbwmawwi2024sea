package excersises.chapter5.laptop;


public class Laptop {
  private String brand;
  private String processor;
  private int memory;
  private LaptopCategory category;

  // Standard-Konstruktor
  public Laptop() {
    this("Unknown", "Unknown", 0, LaptopCategory.STUDENT);
  }

  // Konstruktor mit Marke und Prozessor
  public Laptop(String brand, String processor) {
    this(brand, processor, 0, LaptopCategory.STUDENT);
  }

  // Konstruktor mit allen Attributen
  public Laptop(String brand, String processor, int memory, LaptopCategory category) {
    this.brand = brand;
    this.processor = processor;
    this.memory = memory;
    this.category = category;
  }

  // Methode zur Ausgabe der Details
  public void printDetails() {
    System.out.println("Laptop Details: ");
    System.out.println("Marke: " + brand);
    System.out.println("Prozessor: " + processor);
    System.out.println("Speicher: " + memory + "GB");
    System.out.println("Kategorie: " + category);
    System.out.println();
  }
}
