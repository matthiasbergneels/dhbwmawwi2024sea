package lecture.chapter4;

public class IfExamples {
  public static void main(String[] args) {
    boolean isTired;

    isTired = false;

    System.out.println("Was machen wir?");

    if(isTired) {
      System.out.println("Gehen wir schlafen!");
      System.out.println("Ab ins Bett!");
    } else {
      System.out.println("Lernen wir weiter - Juhu!!!");
    }

    System.out.println("Ende");


    System.out.println("Geschwindigkeits-Evaluation in der Stadt");

    int speed = 35;

    if(speed > 0 && speed <= 30){
      System.out.println("Vorbildliche Geschwindigkeit");
    } else if (speed > 50 && speed <= 70) {
      System.out.println("Jetzt wird es aber nicht so nett... ");
    } else if (speed > 30 && speed <= 50){
      System.out.println("Angemessene Geschwindigkeit");
    } else if(speed <= 0){
      System.out.println("Rückwärts ist auch doof");
    }else {
      System.out.println("Viel viel zu schnell Sie Raser!!!");
    }
  }
}
