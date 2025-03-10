package lecture.chapter9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import lecture.chapter5.Car;

public class ListExample {

  public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<String>(3);

    list.add("Hello");  // index 0
    list.add("World");  // index 1
    //list.add(10);
    //list.add(10.5);
    //list.add(new Car("ROT"));

    System.out.println(list);

    System.out.println("==== Get Index 1");
    System.out.println(list.get(1));

    System.out.println("==== 1. Iteration");
    for(String listElement : list){
      System.out.println(listElement);
    }

    list.add(2, "Klaus");
    list.set(1, "strange World");

    System.out.println("==== 2. Iteration");
    for(String listElement : list){
      System.out.println(listElement);
    }



    Vector<Integer> listOfNumbers = new Vector<Integer>();

    listOfNumbers.add(Integer.valueOf(1));
    listOfNumbers.add(201);
    listOfNumbers.add(-3);
    listOfNumbers.add(45);
    listOfNumbers.add(-50);

    System.out.println("==== 1. Iteration listOfNumbers");
    for(int number : listOfNumbers){
      System.out.println(number);
    }


    System.out.println("====== Count with Strings");

    List<String> textualNumbers = new ArrayList<>();

    textualNumbers.add("Eins");
    textualNumbers.add("Zwei");
    textualNumbers.add("Drei");
    textualNumbers.add("Vier");
    textualNumbers.add("Fünf");

    /* Unsicherer Zugriff auf Listen --> gleichzeitige Iteration und Modifikation
    for(int i = 0; i < textualNumbers.size(); i++){
      if(textualNumbers.get(i).equals("Zwei")){
        textualNumbers.remove(i-1);
      }
      System.out.println(textualNumbers.get(i));
    }

    System.out.println("==== Current List");
    for(String textualNumber : textualNumbers){
      System.out.println(textualNumber);
    }

     */

    Iterator<String> listIterator = textualNumbers.iterator();
    while (listIterator.hasNext()) {
      String currentTextualNumber = listIterator.next();
      if(currentTextualNumber.equals("Zwei")){
        listIterator.remove();
      }else {
        System.out.println(currentTextualNumber);
      }
    }


    for(String textualNumber : textualNumbers){
      if(textualNumber.equals("Drei")){
        textualNumbers.add("Zwei");
      }else {
        System.out.println(textualNumber);
      }
    }


  }
}
