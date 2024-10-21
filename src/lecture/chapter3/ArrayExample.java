package lecture.chapter3;

public class ArrayExample {

  public static void main(String[] args) {

    /*
    int lottoA;
    int lottoB;
    int lottoC;
    int lottoD;
    ...
     */

    // int Array Deklaration
    int[] lottoNumbers;

    // Initialisierung über "new"
    lottoNumbers = new int[7];

    // Einzelne Wertezuweisung
    lottoNumbers[0] = 14;
    lottoNumbers[1] = 27;
    lottoNumbers[2] = 48;
    lottoNumbers[3] = 5;
    lottoNumbers[4] = 9;
    lottoNumbers[5] = 40;
    lottoNumbers[6] = 1;

    System.out.println(lottoNumbers[6]);
    System.out.println(lottoNumbers[5]);

    // Initialisierung & Wertezuweisung über {}-Arrayliteral
    int[] lottoNumbersNextWeek = {8, 17, 35, 42, 28, 1, 9};

    System.out.println("Anzahl an Elementen: " + lottoNumbersNextWeek.length);
    System.out.println(lottoNumbersNextWeek[6]);

    char[] mySignCollection = {'a', '!', 65, '\\'};
    System.out.println(mySignCollection[1]);
    System.out.println(mySignCollection[2]);
    System.out.println(mySignCollection[3]);

    String[] myWords = {"Käse", "Wurst", "Äpfel", "Joghurt"};


    /* Macht man nicht oder eher selten (sehr!!!!!!111111elf)
    Object[] myArrays = new Object[3];

    myArrays[0] = lottoNumbers;
    myArrays[1] = lottoNumbersNextWeek;
    myArrays[2] = myWords;

     */

    char[][] tictactoe = new char[3][3];
    tictactoe[1][1] = 'X';
    tictactoe[1][2] = 'O';
    tictactoe[2][2] = 'X';

    String[][][] chess3D = new String[8][8][8];

    chess3D[0][3][5] = "Turm";


    String[][][] book;

    // 1. Dimension im Buch = Kapitel
    book = new String[10][][];

    // 1. Kapitel im Buch
    // 2. Dimension im Kapitel = Sätze;
    book[0] = new String[15][];

    // 1. Kapitel im Buch, 1. Satz
    // 3. Dimension im Satz = Wörter
    book[0][0] = new String[5];
    book[0][0][0] = "Das";
    book[0][0][1] = "ist";
    book[0][0][2] = "der";
    book[0][0][3] = "erste";
    book[0][0][4] = "Satz";


    String[][][] newBook = {{{"Das", "ist", "der", "erste", "Satz", "."},
                              {"Das", "Buch", "wird", "ein", "tolles", "Buch"}
                            }, {{
                              "Das", "ist", "der", "erste", "Satz", "."
                            }}};


  }
}
