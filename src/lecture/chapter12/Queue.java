package lecture.chapter12;

public class Queue<T> {

  private Node head;
  private Node tail;
  private int size;

  public void enqueue(T data){
    Node newNode = new Node(data);

    if(isEmpty()){
      // empty queue
      head = newNode;
    } else {
      tail.setPrevNode(newNode);
    }

    size++;
    tail = newNode;
  }

  public T dequeue(){
    if(isEmpty()){
      // empty queue
      return null;
    }

    T data = head.getData();
    if(head == tail){
      // just one element in the queue
      head = null;
      tail = null;
    } else {
      // more than one element in the queue
      head = head.getPrevNode();
    }
    size--;
    return data;
  }

  public int size(){
    return size;
  }

  public boolean isEmpty(){
    return head == null && tail == null;
  }


  private class Node{
    private T data;
    private Node prevNode;

    Node(T data){
      this.data = data;
    }

    public T getData() {
      return data;
    }

    public Node getPrevNode() {
      return prevNode;
    }

    public void setPrevNode(Node prevNode) {
      this.prevNode = prevNode;
    }
  }
}
