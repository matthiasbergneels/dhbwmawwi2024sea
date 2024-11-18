package lecture.chapter5;

public class Student {

  private int studentId;
  private String name;

  public Student(int studentId, String name) {
    this.studentId = studentId;
    this.name = name;

  }


  public void drink(float amount){
    System.out.println(name + " trinkt " + amount + " l");
  }

  public void drink(float amount, int coffeinInMg){
    this.drink(amount);
    this.drink(coffeinInMg);
  }

  public void drink(float amount, double alcoholInPercentage){
    this.drink(amount);
    this.drink(alcoholInPercentage);
  }

  public void drink(float amount, double alcoholInPercentage, int coffeinInMg){

    this.drink(amount);
    this.drink(alcoholInPercentage);
    this.drink(coffeinInMg);
  }

  public void drink(double poisonInMg, float amount){
    this.drink(amount);
    System.out.println("und stirbt!");
  }

  private void drink(double alcoholInPercentage){
    System.out.println("und wird betrunken!");
  }

  private void drink(int coffeinInMg){
    System.out.println("und wird wacher!");
  }

}
