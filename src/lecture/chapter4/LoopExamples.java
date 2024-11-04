package lecture.chapter4;

public class LoopExamples {

  public static void main(String[] args) {

    int count = 0;

    System.out.println("Kopfgesteuerte Schleife - while:");
    while(count < 10) {
      int uselessCounter = 0; // --> variablen Scope --> Nur innerhalb der While-Schleife
      if(count % 2 != 0) {
        count++;
        continue;
      }
      System.out.println(count);
      count++;
    }

    count = 0;
    System.out.println("Fußgesteuerte Schleife - do-while:");
    do {
      if(count == 6){
        System.out.println("6 - You shall not pass!!!");
        break;
      }
      System.out.println(count);
      count++;
    }while(count < 10);

    System.out.println("Zähler-Schleife - for:");
    for( int i = 0; i < 10; i++ ) {
      System.out.println(i);
    }


    System.out.println("Timmayyyyyy - for:");
    count = 0;
    for(;;){
      if(count > 9){
        break;
      }
      System.out.println(count);
      count++;
    }



    String[] weekdays = {"Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag", "Samstag", "Sonntag"};
    System.out.println("Zähler-Schleife mit Array - for:");
    for(int i = 0; i < weekdays.length; i++){
      System.out.println(weekdays[i]);
    }


    System.out.println("For-Each-Schleife - for:");
    for(String weekday : weekdays){
      if(weekday.equals("Montag")){
        System.out.println("Würg!!!");
        continue;
      }
      System.out.println(weekday);
    }

    String[] words = new String[5];
    words[0] = "Hallo";
    words[1] = "Nichts";
    words[3] = "";

    for(int i = 0; i < words.length; i++){
      if(words[i] == null){
        continue;
      }
      System.out.println(words[i]);
    }

    System.out.println("For-Each auf Words:");
    for(String word : words){
      if(word == null){
        continue;
      }
      System.out.println(word);
    }
  }
}
