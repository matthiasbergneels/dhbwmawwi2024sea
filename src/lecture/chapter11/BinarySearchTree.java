package lecture.chapter11;

public class BinarySearchTree<T extends Comparable<T>> {

  private Node root;
  private int size;

  public boolean add(T data) {
    if (root == null) {
      root = new Node(data);
      return true;
    }

    return add(data, root);
  }

  private boolean add(T data, Node currentNode) {

    if (currentNode.getData().compareTo(data) > 0) {
      if(currentNode.getLeftNode() == null) {
        currentNode.setLeftNode(new Node(data));
        return true;
      }else {
        return add(data, currentNode.leftNode);
      }
    } else if (currentNode.getData().compareTo(data) < 0) {
      if(currentNode.getRightNode() == null) {
        currentNode.setRightNode(new Node(data));
      } else {
        return add(data, currentNode.rightNode);
      }
    }

    return false;
  }

  public int getSize() {
    return size;
  }

  // in-order-Traversierung (Aufsteigend) --> left - current - right

  public void printInOrder() {
    if(root != null) {
      printInOrder(root);
    }else{
      System.out.println("Der Baum ist leer");
    }
  }

  private void printInOrder(Node currentNode) {
    if(currentNode.getLeftNode() != null){
      printInOrder(currentNode.getLeftNode());
    }

    System.out.println(currentNode.getData());

    if(currentNode.getRightNode() != null){
      printInOrder(currentNode.getRightNode());
    }
  }

  // in-order-Traversierung (Absteigend) --> right - current - left


  // pre-order-Traversierung --> current-left-right
  public void printPreOrder() {
    if(root != null) {
      printPreOrder(root);
    }else {
      System.out.println("Der Baum ist leer");
    }
  }

  private void printPreOrder(Node currentNode) {
    System.out.println(currentNode.getData());

    if(currentNode.getLeftNode() != null){
      printInOrder(currentNode.getLeftNode());
    }

    if(currentNode.getRightNode() != null){
      printInOrder(currentNode.getRightNode());
    }
  }


  // post-order-Traversierung --> left-right-current
  public void printPostOrder() {
    if(root != null) {
      printPostOrder(root);
    }else {
      System.out.println("Der Baum ist leer");
    }
  }

  private void printPostOrder(Node currentNode) {

    if(currentNode.getLeftNode() != null){
      printPostOrder(currentNode.getLeftNode());
    }

    if(currentNode.getRightNode() != null){
      printPostOrder(currentNode.getRightNode());
    }

    System.out.println(currentNode.getData());
  }

  private class Node{

    private T data;
    private Node leftNode;
    private Node rightNode;

    Node(T data) {
      this.data = data;
      size++;
    }

    void setLeftNode(Node leftNode) {
      this.leftNode = leftNode;
    }

    void setRightNode(Node rightNode) {
      this.rightNode = rightNode;
    }

    Node getLeftNode() {
      return leftNode;
    }

    Node getRightNode() {
      return rightNode;
    }

    T getData() {
      return data;
    }
  }
}