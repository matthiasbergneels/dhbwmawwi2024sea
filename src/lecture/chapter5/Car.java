package lecture.chapter5;

class Car {

  // Deklaration der Instanz-Attribute für die Klasse Auto
  String color;
  int hp;
  double speed;
  String licensePlate;
  String brand;
  Color wheelColor;

  // Definition der Instanz-Methoden für die Klasse Auto
  void accelerate(double deltaSpeed){
    if(deltaSpeed > 0) {
      speed += deltaSpeed;
    }
  }

  void brake(){
    // um 5 km/h abbremsen
    speed -= 5;
    if(speed < 0){
      speed = 0;
    }
  }


}

