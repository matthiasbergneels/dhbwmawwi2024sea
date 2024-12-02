package lecture.chapter6;

public abstract class Animal {

  private float weight;
  private float size;
  private String description;

  Animal(float weight, float size, String description) {
    this.weight = weight;
    this.size = size;
    this.description = description;
  }

  public abstract void breath();

  public void eat(){
    System.out.println("Das Tier " + this.description + " frisst!");
  }

  public final void move(){
    System.out.println("Das Tier " + this.description + " bewegt sich!");
  }

  public float getWeight() {
    return weight;
  }

  public float getSize() {
    return size;
  }

  public String getDescription() {
    return description;
  }

  public String toString() {
    return "Das Tier " + this.description + " und wiegt " + this.weight + "kg ist " + this.size + "cm groß";
  }
}
