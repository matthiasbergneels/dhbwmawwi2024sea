package lecture.chapter6;

public final class Dog extends Animal {

  private String breed;

  public Dog(float weight, float size, String description, String breed) {
    super(weight, size, description);

    // direkter Zugriff auf die Vererbten Attribute nicht möglich
    // da --> private
    //this.weight = weight;

    this.breed = breed;
  }

  public void bark(){
    System.out.println("Der Hund "  + this.getDescription() + " bellt!");
  }


  @Override
  public void breath() {
    System.out.println("Der Hund " + this.getDescription() + " atmet!");
  }

  @Override
  public void eat(){
    super.eat();
    System.out.println("und zwar Fleisch weil es ein Hund ist!");
  }

  @Override
   public String toString() {
    return super.toString() + " und ist ein Hund der Rasse " + breed;
  }
}
