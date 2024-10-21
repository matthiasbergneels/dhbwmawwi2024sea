package lecture.chapter4;

public class OperatorExamples {

  public static void main(String[] args) {

    int numberA = 10;
    int numberB = 3;

    int result;

    result = numberA % numberB;     // 10 / 3 --> Rest: 1
    System.out.println(result);

    // Inkrement / Dekrement

    numberA++;      // entspricht: numberA = numberA + 1;
    numberA--;      // entspricht: numberA = numberA - 1;

    System.out.println(numberA);

    System.out.println("Spaß mit Inkrementen:");
    numberA = 10;
    result = numberA++;
    System.out.println("NumberA = " + numberA);
    System.out.println("Result = " + result);
    numberA = 10;
    result = ++numberA;
    System.out.println("NumberA = " + numberA);
    System.out.println("Result = " + result);

    numberA = 10;

    result = numberA++ + numberA++ + numberA++;
    System.out.println("NumberA = " + numberA);
    System.out.println("Result = " + result);

  }
}
