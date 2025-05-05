package lecture.chapter12;

public class DoubleLinkedList<T> {

  private Node firstNode;
  private Node lastNode;

  public void addLast(T data){
    Node newNode = new Node(data);
    if(firstNode == null && lastNode == null){
      firstNode = newNode;
      lastNode = newNode;
    }else{
      lastNode.setNextNode(newNode);
      newNode.setPrevNode(lastNode);
      lastNode = newNode;
    }
  }

  public void addFirst(T data){
    Node newNode = new Node(data);
    if(firstNode == null && lastNode == null){
      firstNode = newNode;
      lastNode = newNode;
    }else{
      firstNode.setPrevNode(newNode);
      newNode.setNextNode(firstNode);
      firstNode = newNode;
    }
  }

  public void delete(T s){
    Node n = findNode(s);
    if(n != null){
      if(n == lastNode){
        n.getPrevNode().setNextNode(null);
        return;
      }
      if(n == firstNode){
        n.getNextNode().setPrevNode(null);
        return;
      }

      n.getPrevNode().setNextNode(n.getNextNode());
      n.getNextNode().setPrevNode(n.getPrevNode());
    }
  }

  public void insertAfter(T prev, T data){
    Node n = findNode(prev);
    if(n != null){
      Node newNode = new Node(data);
      newNode.setNextNode(n.nextNode);
      n.setNextNode(newNode);
      newNode.setPrevNode(n);
      if(n == lastNode){
        lastNode = newNode;
      }
    }
  }


  private Node findNode(T data){

    Node currentNode = firstNode;
    do{
      if(currentNode.getData().equals(data)){
        return currentNode;
      }
      currentNode = currentNode.getNextNode();
    }while(currentNode.getNextNode() != null);

    return null;
  }



  @Override
  public String toString() {
    if(firstNode == null && lastNode == null){
      return "Empty list";
    }else{
      return toString(firstNode);
    }
  }

  private String toString(Node node){
    String s = "";
    s += node.getData() + "\n";
    if(node.getNextNode() != null){
      s += toString(node.getNextNode());
    }
    return s;
  }

  private class Node {

    private T data;
    private Node prevNode;
    private Node nextNode;

    public Node(T data) {
      this.data = data;
      this.prevNode = null;
      this.nextNode = null;
    }

    public T getData() {
      return this.data;
    }

    public Node getPrevNode() {
      return prevNode;
    }

    public void setPrevNode(Node prevNode) {
      this.prevNode = prevNode;
    }

    public Node getNextNode() {
      return nextNode;
    }

    public void setNextNode(Node nextNode) {
      this.nextNode = nextNode;
    }
  }
}