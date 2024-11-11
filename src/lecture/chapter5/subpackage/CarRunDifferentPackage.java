package lecture.chapter5.subpackage;

import lecture.chapter5.Car;
import lecture.chapter5.Color;

// Sichtbarkeit über Paketgrenzen
public class CarRunDifferentPackage {

  public static void main(String[] args) {

    // Deklaration einer Variable Car um auf ein Auto-Objekt zugreifen zu können
    Car myCar;

    Color myWheelColor = new Color();
    myWheelColor.colorHexCode = 0xFF9797;
    myWheelColor.name = "Pink";

    myCar = new Car("pink", 500, "HH-BB 1234", "Mitsubishi", myWheelColor);
    /*
    myCar.color = "Pink";
    myCar.hp = 500;
    myCar.brand = "Mitsubishi";
    myCar.licensePlate = "HH-BB 1234";
    myCar.wheelColor = myWheelColor;
     */


    Car yourCar = new Car("lila", 100, "MA-MA 5678", "Mercedes", new Color()
    );
    /*
    yourCar.color = "Schwarz";
    yourCar.hp = 100;
    yourCar.brand = "Mercedes";
    yourCar.licensePlate = "MA-MA 5678";
     */
    /*
    yourCar.wheelColor.name = "Rot";
    yourCar.wheelColor.colorHexCode = 0xFF0000;
     */

    // myCar.printCarDetails(); // --> printCarDetails() nicht verfügbar, da protected
    // yourCar.printCarDetails(); // --> printCarDetails() nicht verfügbar, da protected

    System.out.println("Mein Auto fährt " + myCar.getSpeed() + " km/h");
    System.out.println("Dein Auto fährt " + yourCar.getSpeed() + " km/h");

    myCar.accelerate(50);
    myCar.accelerate(10);
    myCar.accelerate(Integer.MAX_VALUE);
    myCar.brake();

    /*
    yourCar.speed = Integer.MAX_VALUE;
    myCar.speed = -100;
     */

    System.out.println("Mein Auto fährt " + myCar.getSpeed() + " km/h");
    System.out.println("Dein Auto fährt " + yourCar.getSpeed() + " km/h");

    /*
    myCar.color = "Kack Braun";
     */
    myCar.setColor("kack braun");

    // myCar.printCarDetails(); // --> printCarDetails() nicht verfügbar, da protected

  }
}
