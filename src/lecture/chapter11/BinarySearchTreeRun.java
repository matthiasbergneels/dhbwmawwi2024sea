package lecture.chapter11;

public class BinarySearchTreeRun {

  public static void main(String[] args) {

    BinarySearchTree<String> orderedWords = new BinarySearchTree<>();

    orderedWords.add("Hallo");
    orderedWords.add("Welt");
    orderedWords.add("Alphanumerisch");
    orderedWords.add("Zuletzt");
    orderedWords.add("Bitte");
    orderedWords.add("Danke");
    orderedWords.add("Mittendrin");
    orderedWords.add("Frühstück");


    System.out.println("In-Order-Ausgabe:");
    orderedWords.printInOrder();

    System.out.println("Pre-Order-Ausgabe:");
    orderedWords.printPreOrder();

    System.out.println("Post-Order-Ausgabe:");
    orderedWords.printPostOrder();

    System.out.println("ENDE");


  }
}
