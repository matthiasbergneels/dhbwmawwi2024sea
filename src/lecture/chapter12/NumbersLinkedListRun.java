package lecture.chapter12;

public class NumbersLinkedListRun {

  public static void main(String[] args) {
    NumbersLinkedList numbers = new NumbersLinkedList();

    numbers.add(56);
    numbers.add(70);
    numbers.add(20);
    numbers.add(42);

    System.out.println("Anzahl Elemente: " + numbers.size());
    numbers.printList();

    System.out.println("Enthält 42: " + numbers.contains(42));
    System.out.println("Enthält 17: " + numbers.contains(17));

    System.out.println("Lösche 17: " + numbers.remove(17));
    System.out.println("Lösche 70: " + numbers.remove(70));

    System.out.println("Anzahl Elemente: " + numbers.size());
    numbers.printList();

    System.out.println("Ende");
  }
}
