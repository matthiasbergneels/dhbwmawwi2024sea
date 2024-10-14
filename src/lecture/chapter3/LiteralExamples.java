package lecture.chapter3;

public class LiteralExamples {

  public static void main(String[] args) {

    boolean isTired = true;
    isTired = false;
    System.out.println(isTired);

    int numberA = 5;

    System.out.println(numberA);

    numberA = 05;
    System.out.println(numberA);

    numberA = 10;
    System.out.println(numberA);

    numberA = 010;               // Oktal-Literal: 010 --> Wert 8 (Dezimal)
    System.out.println(numberA);

    numberA = 0x10;              // Hexadezimal-Literal: 0x10 --> Wert 16 (Dezimal)
    System.out.println(numberA);

    numberA = 0x1B;              // Hexadezimal-Literal: 0x1B --> Wert 27 (Dezimal)
    System.out.println(numberA);

    numberA = 0b10;             // Binär-Literal: 0b10 --> Wert 2 (Dezimal)
    System.out.println(numberA);

    numberA = 1_000_000_000;
    System.out.println(numberA);

    long numberC = 2_100_000_000;
    System.out.println(numberC);

    numberC = 2_100_000_000_000l;


    double numberB = 5.0;
    System.out.println(numberB);


  }
}
