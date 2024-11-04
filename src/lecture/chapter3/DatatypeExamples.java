package lecture.chapter3;

public class DatatypeExamples {

  public static void main(String[] args) {

    // Variablendeklaration
    int numberA;

    // Initialisierung
    numberA = 5;

    int numberB = 10;

    int numberC, numberD = 10, numberE;

    int result = numberA + 5;

    boolean isTired = false;

    double numberF = 1.2;

    numberB = 15;
    numberC = 20;
    numberD = 20;
    numberE = 20;

    // Deklaration & Initialisierung einer Konstante
    final double PI = 3.14;

    // nicht möglich --> weil Konstant
    // PI = 5;

    final double E;
    E = 2.6;

    char myCharacter = 'a';


    // Konvertierung
    numberA = 2_123_456_789;

    System.out.println("Konvertierung von int zu float:");
    float numberG = numberA;

    System.out.println(numberA);
    System.out.println(numberG);

    System.out.println("Konvertierung von float zu int:");
    numberA = (int)numberG;

    System.out.println(numberA);
    System.out.println(numberG);

    System.out.println("Konvertierung von int zu double:");
    numberA = 2_123_456_789;
    numberF = numberA;

    System.out.println(numberA);
    System.out.println(numberF);
  }
}
