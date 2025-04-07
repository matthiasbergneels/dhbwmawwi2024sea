package lecture.chapter11;

public class NumbersLinkedListRun {

  public static void main(String[] args) {
    NumbersLinkedList numbers = new NumbersLinkedList();

    numbers.add(56);
    numbers.add(70);
    numbers.add(20);
    numbers.add(42);

    numbers.printList();


    System.out.println("Ende");
  }
}
