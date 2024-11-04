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
    ++numberA;      // entspricht: numberA = numberA + 1;
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


    numberA = 5;
    numberB = 9;
    double numberC = 9;

    result = numberA + numberB;     // ==> 14

    result = numberA % numberB;         // ==> 5
    result = numberA / numberB;         // ==> 0
    System.out.println(result);

    double doubleResult = numberA / (float)numberB;    // ==> 0.0
    System.out.println(doubleResult);

    // result = numberA / numberC;
    doubleResult = numberA / numberC;    // ==> 0.55555555
    System.out.println(doubleResult);

    System.out.println("numberA: " + numberA);
    numberA++;                                  // numberA = numberA + 1;
    System.out.println("numberA: " + numberA);


    result = numberA++ + numberB + numberA;
    System.out.println(result);
    System.out.println("numberA: " + numberA);

    // result = numberA++ + ++numberA + numberA++;      // nicht machen! :-)


    // Zuweisungsoperatoren
    numberA += 10;        // Kurz für: numberA = numberA + 10;
    numberA *= numberB;   // ==> numberA = numberA * numberB;
    System.out.println(numberA);


    boolean isRaining = false;

    System.out.println("Brauche ich einen Regenschirm? " + (isRaining ? "Ja" : "Nein"));

    System.out.print("Brauche ich einen Regenschirm? ");
    if(isRaining){
      System.out.println("Ja");
    }else {
      System.out.println("Nein");
    }

    int biggerNumber = (numberA > numberB) ? numberA : numberB;

    // String-Verkettung ==> +-Operator

    String worldText = "Welt!";
    String myText = "" + numberA + numberB + "Hallo" + " " + worldText + numberA + numberB;
    System.out.println(myText);
  }
}
