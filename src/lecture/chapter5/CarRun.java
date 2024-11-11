package lecture.chapter5;

public class CarRun {

  public static void main(String[] args) {

    // Deklaration einer Variable Car um auf ein Auto-Objekt zugreifen zu können
    Car myCar;

    Color myWheelColor = new Color();
    myWheelColor.colorHexCode = 0xFF9797;
    myWheelColor.name = "Pink";

    myCar = new Car("Pink", 500, "HH-BB 1234", "Mitsubishi", myWheelColor);
    /*
    myCar.color = "Pink";
    myCar.hp = 500;
    myCar.brand = "Mitsubishi";
    myCar.licensePlate = "HH-BB 1234";
    myCar.wheelColor = myWheelColor;
     */


    Car yourCar = new Car("Schwarz", 100, "MA-MA 5678", "Mercedes", new Color()
    );
    /*
    yourCar.color = "Schwarz";
    yourCar.hp = 100;
    yourCar.brand = "Mercedes";
    yourCar.licensePlate = "MA-MA 5678";
     */

    myCar.printCarDetails();
    yourCar.printCarDetails();

    System.out.println("Mein Auto fährt " + myCar.speed + " km/h");
    System.out.println("Dein Auto fährt " + yourCar.speed + " km/h");

    myCar.accelerate(50);
    myCar.accelerate(10);
    myCar.brake();

    System.out.println("Mein Auto fährt " + myCar.speed + " km/h");
    System.out.println("Dein Auto fährt " + yourCar.speed + " km/h");

  }
}
