package lecture.chapter11;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/*
public class GenericLinkedListCF<T> implements List<T> {

  private Node firstNode;
  private int size = 0;

  public void add(T data){
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


  // Size() --> O(1)
  public int size(){
    return size;
  }

  @Override
  public boolean isEmpty() {
    return false;
  }



  @Override
  public Iterator iterator() {
    return new Iterator() {
      @Override
      public boolean hasNext() {
        return false;
      }

      @Override
      public Object next() {
        return null;
      }
    };
  }

  @Override
  public Object[] toArray() {
    return new Object[0];
  }

  @Override
  public boolean add(T o) {
    return false;
  }

  @Override
  public boolean remove(Object o) {
    return false;
  }

  @Override
  public boolean addAll(Collection c) {
    return false;
  }

  @Override
  public boolean addAll(int index, Collection c) {
    return false;
  }

  @Override
  public void clear() {

  }

  @Override
  public Object get(int index) {
    return null;
  }

  @Override
  public Object set(int index, Object element) {
    return null;
  }

  @Override
  public void add(int index, Object element) {

  }

  @Override
  public T remove(int index) {
    return null;
  }

  @Override
  public int indexOf(Object o) {
    return 0;
  }

  @Override
  public int lastIndexOf(Object o) {
    return 0;
  }

  @Override
  public ListIterator listIterator() {
    return null;
  }

  @Override
  public ListIterator listIterator(int index) {
    return null;
  }

  @Override
  public List subList(int fromIndex, int toIndex) {
    return List.of();
  }

  @Override
  public boolean retainAll(Collection c) {
    return false;
  }

  @Override
  public boolean removeAll(Collection c) {
    return false;
  }

  @Override
  public boolean containsAll(Collection c) {
    return false;
  }

  @Override
  public Object[] toArray(Object[] a) {
    return new Object[0];
  }

  public boolean contains(T data){
    Node currentNode = firstNode;
    while(currentNode != null){
      if(currentNode.getData() == data){
        return true;
      }
      currentNode = currentNode.getNextNode();
    }
    return false;
  }

  public boolean remove(T data){
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
    private T data;
    private Node nextNode;

    Node(T data){
      this.data = data;
      this.nextNode = null;
    }

    T getData(){
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
*/

