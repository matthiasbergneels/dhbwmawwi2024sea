package lecture.chapter5;

public class CarRun {

  public static void main(String[] args) {

    // Deklaration einer Variable Car um auf ein Auto-Objekt zugreifen zu können
    Car myCar;

    Color myWheelColor = new Color();
    myWheelColor.colorHexCode = 0xFF9797;
    myWheelColor.name = "Pink";

    myCar = new Car();
    myCar.color = "Pink";
    myCar.hp = 500;
    myCar.brand = "Mitsubishi";
    myCar.licensePlate = "HH-BB 1234";
    myCar.wheelColor = myWheelColor;


    Car yourCar = new Car();
    yourCar.color = "Schwarz";
    yourCar.hp = 100;
    yourCar.brand = "Mercedes";
    yourCar.licensePlate = "MA-MA 5678";

    System.out.println("Mein Auto ist ein " + myCar.brand
                        + " in der Farbe " + myCar.color
                        + " mit " + myCar.hp + " PS"
                        + " und hat das Nummernschild " + myCar.licensePlate
                        + " Räderfarbe: " + myCar.wheelColor.name + "(HexCode: " + myCar.wheelColor.colorHexCode + ")");

    System.out.println("Mein Auto ist ein " + yourCar.brand
      + " in der Farbe " + yourCar.color
      + " mit " + yourCar.hp + " PS"
      + " und hat das Nummernschild " + yourCar.licensePlate);

    System.out.println("Mein Auto fährt " + myCar.speed + " km/h");
    System.out.println("Dein Auto fährt " + yourCar.speed + " km/h");

    myCar.accelerate(50);
    myCar.accelerate(10);
    myCar.brake();

    System.out.println("Mein Auto fährt " + myCar.speed + " km/h");
    System.out.println("Dein Auto fährt " + yourCar.speed + " km/h");

  }
}
