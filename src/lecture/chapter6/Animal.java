package lecture.chapter6;

public class Animal {

  private float weight;
  private float size;
  private String description;

  Animal(float weight, float size, String description) {
    this.weight = weight;
    this.size = size;
    this.description = description;
  }

  public void breath(){
    System.out.println("Das Tier " + this.description + " atmet!");
  }

  public void eat(){
    System.out.println("Das Tier " + this.description + " frisst!");
  }

  public void move(){
    System.out.println("Das Tier " + this.description + " bewegt sich!");
  }
}
