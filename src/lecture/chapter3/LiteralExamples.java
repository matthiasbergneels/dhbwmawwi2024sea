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

    numberB = .0627;
    System.out.println(numberB);

    numberB = -4e-3;
    System.out.println(numberB);

    numberB = -4e10;
    System.out.println(numberB);

    float numberF = 5.0F;
    System.out.println(numberF);

    char firstCharacter = 'a';
    System.out.println(firstCharacter);

    firstCharacter = '7';
    System.out.println(firstCharacter);

    firstCharacter = '\'';
    System.out.println(firstCharacter);

    firstCharacter = '\\';
    System.out.println(firstCharacter);

    char newLineCar = '\n';
    System.out.println(newLineCar);
    char nChar = 'n';
    System.out.println(nChar);

    firstCharacter = '\u2764';
    System.out.println(firstCharacter);

    String myText = "Das hier ist ein langer toller\n Text der \"kaum\" Ironie \tenthält \u2764";
    System.out.println(myText);

    String htmlPage = """
      <html>
        <head>
          <title>Meine "tolle" HTML Seite in Java</title>
        </head>
        <body>
          <h1>Meine tolle HTML Seite in Java</h1>
        </body>
      </html>
      """;

    System.out.println(htmlPage);

    // Konvertierung von Datentypen

    // Implizite Konvertierung (von "klein" nach "groß" / von "unpräzise" nach "präzise")
    double targetNumberD;

    targetNumberD = numberA;
    targetNumberD = numberC;

    int targetNumberA;


    numberB = 5.8;
    targetNumberA = (int)numberB;

    System.out.println(numberB);
    System.out.println(targetNumberA);

    byte targetNumberB;

    targetNumberB = (byte)targetNumberA;
    System.out.println(targetNumberA);
    System.out.println(targetNumberB);

    firstCharacter = 'A';
    targetNumberA = firstCharacter;
    System.out.println(targetNumberA);


    targetNumberA = 129;
    targetNumberB = (byte)targetNumberA;
    System.out.println(targetNumberA);
    System.out.println(targetNumberB);
  }
}
