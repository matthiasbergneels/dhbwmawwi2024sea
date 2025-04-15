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

  // in-order-Traversierung --> left - current - right
  // pre-order-Traversierung --> current-left-right
  // post-order-Traversierung --> left-right-current

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
