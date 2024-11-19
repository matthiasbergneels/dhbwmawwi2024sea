package lecture.chapter5;

public class Car {

  // Deklaration der Klassen-Attribute für die Klasse Auto
  private static int carCount;

  // Deklaration der Instanz-Attribute für die Klasse Auto
  private String colour;
  private int hp;
  private double speed;
  private String licensePlate;
  final public CarBrand brand;
  private Colour wheelColour;


  // "Klassen"-Konstrutor
  static {
    carCount = 0;
  }

  // Konstruktor-Definition
  public Car(String color, int hp, String licensePlate, CarBrand brand, Colour wheelColour){
    this.setColour(color);
    this.hp = hp;
    this.licensePlate = licensePlate;
    this.brand = brand;
    this.wheelColour = wheelColour;
    this.speed = 0.0;

    carCount++;
  }

  public Car(){
    this("Pink", 240, "HD HH-1234", CarBrand.BMW, new Colour());
  }

  public Car(String colour){
    this(colour, 240, "HD HH-1234", CarBrand.BMW, new Colour());
  }

  // Definition der Instanz-Methoden für die Klasse Auto
  public void accelerate(double deltaSpeed){
    if(deltaSpeed > 0 && deltaSpeed <= 50) {
      this.speed += deltaSpeed;
    }
  }

  public void brake(){
    // um 5 km/h abbremsen
    this.speed -= 5;
    if(this.speed < 0){
      this.speed = 0;
    }
  }

  protected void printCarDetails(){
    System.out.println("Das Auto ist ein " + this.brand + "(" + this.brand.getPriceRange()  + ")"
      + " in der Farbe " + this.colour
      + " mit " + this.hp + " PS"
      + " und hat das Nummernschild " + this.licensePlate
      + " Räderfarbe: " + this.wheelColour.name + "(HexCode: " + this.wheelColour.colorHexCode + ")");
  }

  public double getSpeed(){
    return this.speed;
  }

  public void setColour(String colour){
    if(colour.equals("rot") ||
        colour.equals("schwarz") ||
        colour.equals("pink") ||
        colour.equals("grün") ||
        colour.equals("grau")){
      this.colour = colour;
    }else {
      if(this.colour == null){
        this.colour = "grau";
      }
    }

  }

  public String getColour(){
    return this.colour;
  }

  public int getHp(){
    return this.hp;
  }

  public void setHp(int hp){
    this.hp = hp;
  }

  public static int getCarCount(){
    return carCount;
  }


  protected void finalize(){
    System.out.println("Folgendes Auto wird verschrottet:");
    this.printCarDetails();
    carCount--;
  }
}

