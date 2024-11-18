package lecture.chapter5;

public class Car {

  // Deklaration der Klassen-Attribute für die Klasse Auto
  private static int carCount;

  // Deklaration der Instanz-Attribute für die Klasse Auto
  private String color;
  private int hp;
  private double speed;
  private String licensePlate;
  final public CarBrand brand;
  private Color wheelColor;

  // Konstruktor-Definition
  public Car(String color, int hp, String licensePlate, CarBrand brand, Color wheelColor){
    this.setColor(color);
    this.hp = hp;
    this.licensePlate = licensePlate;
    this.brand = brand;
    this.wheelColor = wheelColor;
    this.speed = 0.0;

    carCount++;
  }

  public Car(){
    this("Pink", 240, "HD HH-1234", CarBrand.BMW, new Color());
  }

  public Car(String color){
    this(color, 240, "HD HH-1234", CarBrand.BMW, new Color());
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
    System.out.println("Das Auto ist ein " + this.brand
      + " in der Farbe " + this.color
      + " mit " + this.hp + " PS"
      + " und hat das Nummernschild " + this.licensePlate
      + " Räderfarbe: " + this.wheelColor.name + "(HexCode: " + this.wheelColor.colorHexCode + ")");
  }

  public double getSpeed(){
    return this.speed;
  }

  public void setColor(String color){
    if(color.equals("rot") ||
        color.equals("schwarz") ||
        color.equals("pink") ||
        color.equals("grün") ||
        color.equals("grau")){
      this.color = color;
    }else {
      if(this.color == null){
        this.color = "grau";
      }
    }

  }

  public String getColor(){
    return this.color;
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
}

