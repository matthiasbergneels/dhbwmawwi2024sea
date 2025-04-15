package lecture.chapter11;

public class GenericLinkedListRun {

  public static void main(String[] args) {
    GenericLinkedList<String> genericLinkedList = new GenericLinkedList<String>();

    genericLinkedList.add("Sonne");
    genericLinkedList.add("Mond");
    genericLinkedList.add("Sterne");

    genericLinkedList.printList();
    genericLinkedList.printListRecursive();



  }
}
