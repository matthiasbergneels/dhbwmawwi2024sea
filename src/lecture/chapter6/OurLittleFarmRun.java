package lecture.chapter6;

public class OurLittleFarmRun {

  public static void main(String[] args) {

    /*
    Animal myAnimal = new Animal(15.5f, 17.3f, "Tierchen");

    myAnimal.breath();
    myAnimal.move();
    myAnimal.eat();
     */

    Dog myDog = new Dog(50.0f, 65f, "Bello", "Schäferhund");

    myDog.breath();
    myDog.move();
    myDog.eat();
    myDog.bark();

    Bird myBird = new Bird(.1f, 9, "Tweety", true);

    myBird.breath();
    myBird.move();
    myBird.eat();
    myBird.tweet();

    System.out.println(myDog);        // toString() Methode wird implizit aufgerufen
    //System.out.println(myAnimal);     // toString() Methode wird implizit aufgerufen
    System.out.println(myBird);       // toString() Methode wird implizit aufgerufen

    // Narrowing Cast --> Sichtbarkeit wird eingeschränkt (Vererbungshierachie nach "Oben")
    Animal myAnimal = myDog;

    myAnimal.move();
    // myAnimal.bark(); // nicht mehr Sichtbar
    myAnimal.eat();
    myAnimal.breath();

    Object myObject = myAnimal;

    System.out.println(myObject);


    // Widening Cast --> Erweitern der Sichtbarkeit (Vererbungshierachie nach "Unten")
    Dog mySecondDogReference = (Dog)myAnimal;

    mySecondDogReference.eat();
    mySecondDogReference.breath();
    mySecondDogReference.move();
    mySecondDogReference.bark();


    Animal[] animalShelter = new Animal[5];

    // Narrowing Cast
    animalShelter[0] = myDog;
    animalShelter[1] = myBird;
    animalShelter[2] = new Dog(15, 30, "Hasso", "Chiwawah");
    animalShelter[3] = new Dog(15, 9, "Bruno", "Dackel");
    animalShelter[4] = new Bird(10, 30, "Lorenzo", false);

    for(Animal currentAnimal : animalShelter) {
      currentAnimal.eat();
      currentAnimal.breath();
      currentAnimal.move();

      if(currentAnimal instanceof Dog) {
        // ((Dog)currentAnimal).bark(); Kurzform
        Dog currentDog = (Dog)currentAnimal;
        currentDog.bark();
      }

      /* --> neu seit Java 17 (?)
      if(currentAnimal instanceof Bird currentBird) {
        currentBird.tweet();
      }
       */
    }

  }
}
