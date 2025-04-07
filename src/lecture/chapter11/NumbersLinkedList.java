package lecture.chapter11;

public class NumbersLinkedList {

  private Node firstNode;
  private int size = 0;

  public void add(int data){
    Node newNode = new Node(data);
    size++;

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
    while(currentNode != null){
      System.out.print(currentNode.getData() + " ");
      currentNode = currentNode.getNextNode();
    }

    System.out.println();
  }

  /* --> O(n)
  public int size(){
    int size = 0;
    Node currentNode = firstNode;
    while(currentNode != null){
      size++;
      currentNode = currentNode.getNextNode();
    }

    return size;
  }
   */

  // Size() --> O(1)
  public int size(){
    return size;
  }

  public boolean contains(int data){
    Node currentNode = firstNode;
    while(currentNode != null){
      if(currentNode.getData() == data){
        return true;
      }
      currentNode = currentNode.getNextNode();
    }
    return false;
  }

  public boolean remove(int data){
    // TODO --> entferne erste gefunde Element das "data" entspricht return true; return false Element nicht enthalten

    if(firstNode == null){
      return false;
    }

    // 1. Case --> first Element should be deleted
    if(firstNode.getData() == data){
      firstNode = firstNode.getNextNode();
      size--;
      return true;
    }

    // 2. Case --> second or further Element should be deleted
    Node currentNode = firstNode;
    while(currentNode.getNextNode() != null){
      if(currentNode.getNextNode().getData() == data){
        currentNode.setNextNode(currentNode.getNextNode().getNextNode());
        size--;
        return true;
      }
      currentNode = currentNode.getNextNode();
    }

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
