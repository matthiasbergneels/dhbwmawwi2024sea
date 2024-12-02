package lecture.chapter6;

public class OurLittleFarmRun {

  public static void main(String[] args) {

    Animal myAnimal = new Animal(15.5f, 17.3f, "Tierchen");

    myAnimal.breath();
    myAnimal.move();
    myAnimal.eat();
  }
}
