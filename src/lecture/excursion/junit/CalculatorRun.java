package lecture.excursion.junit;

public class CalculatorRun {

  public static void main(String[] args) {
    Calculator calc = new Calculator();

    double result = calc.add(10, -2);

    if(result == 8.0) {
      System.out.println("Erfolgreich!");
    } else {
      System.out.println("NICHT erfolgreich!");
    }


  }
}
