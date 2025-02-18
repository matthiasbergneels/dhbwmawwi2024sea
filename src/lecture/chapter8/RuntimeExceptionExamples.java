package lecture.chapter8;

public class RuntimeExceptionExamples {

  public static void main(String[] args) {

    String[] words = {"Wir", "wollen", "Feierabend", "!", null};

    for(int i = 0; i < words.length; i++) {
      try {
        System.out.println(words[i] + " - Anzahlzeichen: " + (words[i] != null ? words[i].length() : 0));
      }catch(NullPointerException e) {
        System.out.println(e.getMessage());
      }
    }

  }

}
