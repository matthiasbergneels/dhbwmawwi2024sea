package excersises.chapter5.smartphone;

public class Smartphone {
  private String brand;
  private String model;
  private double price;
  private SmartphoneType type;

  // Konstruktor mit allen Attributen
  public Smartphone(String brand, String model, double price, SmartphoneType type) {
    setBrand(brand);
    setModel(model);
    setPrice(price);
    setType(type);
  }

  // Getter-Methoden
  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public double getPrice() {
    return price;
  }

  public SmartphoneType getType() {
    return type;
  }

  // Setter-Methoden mit Plausibilitätsprüfungen
  public void setBrand(String brand) {
    this.brand = (brand == null || brand.isEmpty()) ? "Unknown" : brand;
  }

  public void setModel(String model) {
    this.model = (model == null || model.isEmpty()) ? "Unknown" : model;
  }

  public void setPrice(double price) {
    this.price = (price < 0) ? 0.0 : price;
  }

  public void setType(SmartphoneType type) {
    this.type = (type == null) ? SmartphoneType.ANDROID : type;
  }

  public void printDetails() {
    System.out.println("Smartphone Details: " + brand + " " + model + ", Typ: " + type + ", Preis: " + price + "€");
  }

  // Überladene Methode mit optionaler Nachricht
  public void printDetails(String message) {
    printDetails(); // Ruft die Standardausgabe auf
    System.out.println("Meldung: " + message);
  }
}