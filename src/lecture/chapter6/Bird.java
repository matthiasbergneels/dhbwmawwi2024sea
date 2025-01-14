package lecture.chapter6;

public class Bird extends Animal{

  private boolean canFly;

  public Bird(float weight, float size, String description, boolean canFly) {
    super(weight, size, description);
    this.canFly = canFly;
  }

  public void tweet(){
    System.out.println("Der Vogel " + this.getDescription() + " zwitschert!");
  }

  @Override
  public void breath() {
    System.out.println("Der Vogel " + this.getDescription() + " atmet!");
  }
}
