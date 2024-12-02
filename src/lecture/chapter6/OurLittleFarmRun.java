package lecture.chapter6;

public class OurLittleFarmRun {

  public static void main(String[] args) {

    Animal myAnimal = new Animal(15.5f, 17.3f, "Tierchen");

    myAnimal.breath();
    myAnimal.move();
    myAnimal.eat();

    Dog myDog = new Dog(50.0f, 65f, "Bello", "Schäferhund");

    myDog.breath();
    myDog.move();
    myDog.eat();
    myDog.bark();

    System.out.println(myDog);
    System.out.println(myAnimal.toString());

  }
}
