package lecture.chapter5;

class Car {

  // Deklaration der Instanz-Attribute für die Klasse Auto
  String color;
  int hp;
  double speed;
  String licensePlate;
  String brand;
  Color wheelColor;

  // Konstruktor-Definition
  Car(String color, int hp, String licensePlate, String brand, Color wheelColor){
    this.color = color;
    this.hp = hp;
    this.licensePlate = licensePlate;
    this.brand = brand;
    this.wheelColor = wheelColor;

    this.speed = 0.0;
  }

  // Definition der Instanz-Methoden für die Klasse Auto
  void accelerate(double deltaSpeed){
    if(deltaSpeed > 0) {
      this.speed += deltaSpeed;
    }
  }

  void brake(){
    // um 5 km/h abbremsen
    this.speed -= 5;
    if(this.speed < 0){
      this.speed = 0;
    }
  }

  void printCarDetails(){
    System.out.println("Mein Auto ist ein " + brand
      + " in der Farbe " + color
      + " mit " + myCar.hp + " PS"
      + " und hat das Nummernschild " + licensePlate
      + " Räderfarbe: " + wheelColor.name + "(HexCode: " + colorHexCode + ")");
  }


}

