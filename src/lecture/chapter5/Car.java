package lecture.chapter5;

public class Car {

  // Deklaration der Instanz-Attribute für die Klasse Auto
  private String color;
  private int hp;
  private double speed;
  private String licensePlate;
  final public String brand;
  private Color wheelColor;

  // Konstruktor-Definition
  public Car(String color, int hp, String licensePlate, String brand, Color wheelColor){
    this.setColor(color);
    this.hp = hp;
    this.licensePlate = licensePlate;
    if(brand.equals("Mercedes") || brand.equals("BMW") || brand.equals("Mitsubishi")){
      this.brand = brand;
    }else{
      this.brand = "Mitsubishi";
    }

    this.wheelColor = wheelColor;

    this.speed = 0.0;
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

}

