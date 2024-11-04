package lecture.chapter4;

public class StringFalseFriend {

  public static void main(String[] args) {

    String text1 = "Hallo";
    String text2 = "Hallo";
    String text3 = "Klaus";
    String text4 = "Hal" + "lo";
    String text5 = new String("Hallo");

    System.out.println(text1);
    System.out.println(text2);
    System.out.println(text3);
    System.out.println(text4);
    System.out.println(text5);


    System.out.println(text1 + " ist gleich " + text2 + ": " + (text1 == text2));
    System.out.println(text1 + " ist gleich " + text3 + ": " + (text1 == text3));
    System.out.println(text1 + " ist gleich " + text4 + ": " + (text1 == text4));
    System.out.println(text1 + " ist gleich " + text5 + ": " + (text1 == text5));

    System.out.println(text1 + " ist INHALTLICH gleich " + text2 + ": " + (text1.equals(text2)));
    System.out.println(text1 + " ist INHALTLICH gleich " + text3 + ": " + (text1.equals(text3)));
    System.out.println(text1 + " ist INHALTLICH gleich " + text4 + ": " + (text1.equals(text4)));
    System.out.println(text1 + " ist INHALTLICH gleich " + text5 + ": " + (text1.equals(text5)));


  }
}
