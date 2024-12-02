package lecture.chapter6;

public class Dog extends Animal {

  private String breed;

  public Dog(float weight, float size, String description, String breed) {
    super(weight, size, description);

    // direkter Zugriff auf die Vererbten Attribute nicht möglich
    // da --> private
    //this.weight = weight;

    this.breed = breed;
  }

  public void bark(){
    System.out.println("Der Hund "  + this.description + " bellt!");
  }
}