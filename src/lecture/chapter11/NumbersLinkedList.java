package lecture.chapter11;

public class NumbersLinkedList {

  Node firstNode;

  public void add(int data){
    Node newNode = new Node(data);

    if(firstNode == null){
      firstNode = newNode;
      return;
    }

    Node currentNode = firstNode;
    while(currentNode.getNextNode() != null){
      currentNode = currentNode.getNextNode();
    }

    currentNode.setNextNode(newNode);
  }

  public void printList(){
    // TODO --> add optimieren!
    if(firstNode == null){
      System.out.println("List is empty");
      return;
    }

    Node currentNode = firstNode;
    while(currentNode.getNextNode() != null){
      System.out.print(currentNode.getData() + " ");
      currentNode = currentNode.getNextNode();
    }

    System.out.print(currentNode.getData());
    System.out.println();

  }

  public int size(){
    // TODO --> Anzahl der Elemente in der Liste
    return 0;
  }

  public boolean contains(int data){
    // TODO --> Element in der Liste enthalten
    return false;
  }

  public boolean remove(int data){
    // TODO --> entferne erste gefunde Element das "data" entspricht return true; return false Element nicht enthalten
    return false;
  }



  private class Node {
    private int data;
    private Node nextNode;

    Node(int data){
      this.data = data;
      this.nextNode = null;
    }

    int getData(){
      return data;
    }

    Node getNextNode(){
      return nextNode;
    }

    void setNextNode(Node nextNode){
      this.nextNode = nextNode;
    }
  }

}
