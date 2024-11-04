package lecture.chapter4;

public class SwitchCaseExample {

  public static void main(String[] args) {

    int myGrade = 4;

    System.out.print("Meine Note " + myGrade + " bedeutet: ");
    switch(myGrade){
      case 1:
        System.out.println("Sehr gut");
        break;
      case 2:
        System.out.println("Gut");
        break;
      case 3:
        System.out.println("Befriedigend");
        break;
      case 4:
        System.out.println("Ausreichend");
        break;
      case 5:
        System.out.println("Ungenügend");
        break;
      default:
        System.out.println("Ungültige Note!");
        break;
      case 6:
        System.out.println("Mangelhaft");
    }

    System.out.print("Mit meiner " + myGrade + " habe ich bestanden?: ");
    switch(myGrade){
      case 1, 2, 3, 4:
        System.out.println("Ja");
        break;
      case 5, 6:
        System.out.println("Nein");
        break;
      default:
        System.out.println("Nicht bekannt");
        break;
    }

    System.out.print("Meine Note " + myGrade + " bedeutet: ");
    switch(myGrade){
      case 1 -> System.out.println("Sehr gut");
      case 2 -> System.out.println("Gut");
      case 3 -> System.out.println("Befriedigend");
      case 4 -> System.out.println("Ausreichend");
      case 5 -> System.out.println("Ungenügend");
    }


    String evaluation = switch(myGrade){
      case 1 -> "Sehr gut";
      case 2 -> "Gut";
      case 3 -> "Befriedigend";
      case 4 -> "Ausreichend";
      case 5 -> "Ungenügend";
      default -> "Ungültige Note!";
    };

    System.out.println("Meine Note " + myGrade + " bedeutet: " + evaluation);

    String day = "MONDAY";
    int numLetters = switch (day) {
      case "MONDAY", "FRIDAY", "SUNDAY" -> 6;
      case "TUESDAY" -> 7;
      default      -> {
        int result = day.length();
        yield result;
      }
    };
    System.out.println(day + " hat " + numLetters + " Buchstaben");

  }
}
