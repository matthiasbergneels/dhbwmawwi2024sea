package lecture.chapter11;

public class Stack<T> {

  private Node head;
  private int size;

  public void push(T data){
    head = new Node(data, head);
    size++;
  }

  public T pop(){
    if(head == null){
      return null;
    }

    T data = head.getData();
    head = head.getNextNode();
    size--;
    return data;
  }

  public T peek(){
    return (head == null) ? null : head.getData();
  }

  public int size(){
    return size;
  }

  public boolean isEmpty(){
    return head == null;
  }

  private class Node{
    private T data;
    private Node nextNode;

    Node(T data, Node nextNode){
      this.data = data;
      this.nextNode = nextNode;
    }

    T getData(){
      return this.data;
    }
    Node getNextNode(){
      return nextNode;
    }
  }
}
