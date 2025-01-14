package excersises.chapter5.smartphone;

public class SmartphoneTest {
  public static void main(String[] args) {
    // Erstellen von Smartphone-Objekten
    Smartphone phone1 = new Smartphone("Apple", "iPhone 13", 999.99, SmartphoneType.IOS);
    Smartphone phone2 = new Smartphone("Samsung", "Galaxy S21", 799.99, SmartphoneType.ANDROID);
    Smartphone phone3 = new Smartphone("", "", -100, null); // Ungültige Werte

    // Ausgabe der Details ohne Nachricht
    phone1.printDetails();
    phone2.printDetails();
    phone3.printDetails();

    System.out.println();

    // Ausgabe der Details mit Nachricht
    phone1.printDetails("Sonderangebot!");
    phone2.printDetails("Restbestand!");
    phone3.printDetails("Reduzierte Ware!");
  }
}
