package lecture.chapter5;

public class VarArgsExample {

  public static void sumOfNumbers(int... numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    System.out.println("Summe: " + sum);
  }

  public static void sumOfNumbers(String drinkType, int... numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    System.out.println("Anzahl an " + drinkType + " : " + sum);
  }

  /*
  public static void sumOfNumbers(){
    System.out.println(0);
  }

  public static void sumOfNumbers(int numberA){
    System.out.println(numberA);
  }

  public static void sumOfNumbers(int numberA, int numberB){
    System.out.println(numberA + numberB);
  }

  public static void sumOfNumbers(int numberA, int numberB, int numberC){
    System.out.println(numberA + numberB + numberC);
  }


   */


  public static void main(String[] args) {
    sumOfNumbers(1);          // Gibt: "Summe: 1"
    sumOfNumbers("Bier", 1, 2, 3, 10, 56, 83);    // Gibt: "Summe: 6"
    sumOfNumbers();           // Gibt: "Summe: 0"
  }
}
