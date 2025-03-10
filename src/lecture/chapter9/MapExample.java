package lecture.chapter9;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExample {

  public static void main(String[] args) {

    Map<Integer, String> cities = new HashMap();

    cities.put(69190, "Walldorf");
    cities.put(69694, "Weinheim");
    cities.put(69181, "Leimen");
    cities.put(68163, "Mannheim");
    cities.put(68305, "Mannheim");


    System.out.println(cities.get(69190));

    cities.remove(69190);

    System.out.println(cities.get(69190));

    System.out.println(cities.get(69181));
    cities.put(69181, "Leimen, Sankt Ilgen");
    System.out.println(cities.get(69181));

    System.out.println("Anzahl Städte: " + cities.size());


    System.out.println("Alle Städte:");
    Collection<String> cityList = cities.values();
    for(String city : cityList){
      System.out.println(city);
    }

    System.out.println("Alle Postleitzahlen:");
    Set<Integer> postalCodes = cities.keySet();
    for(int postalCode : postalCodes){
      System.out.println(postalCode + ": " + cities.get(postalCode));
    }



    cities.clear();
    System.out.println("Anzahl Städte: " + cities.size());

  }
}
