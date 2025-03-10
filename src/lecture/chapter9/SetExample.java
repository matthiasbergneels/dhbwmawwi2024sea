package lecture.chapter9;

import com.sun.source.tree.Tree;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

  public static void main(String[] args) {

    Set<String> names = new TreeSet<>();

    names.add( "Zeus" );
    names.add( "Klaus" );
    names.add( "Anna" );
    names.add( "Kim" );
    names.add( "Gil" );
    names.add( "Kim" );

    System.out.println("Anzahl Namen: " + names.size());

    for(String name : names){
      System.out.println(name + " - HashWert: " + name.hashCode());
    }

    Set<Student> students = new TreeSet<>();

    students.add(new Student(4711, "Anna", 21, "Müller"));
    students.add(new Student(5813, "Klaus", 23, "Zeus"));
    students.add(new Student(2138, "Aneta", 25, "Frech"));
    students.add(new Student(9999, "Klaus", 23, "Zeus"));
    students.add(new Student(0001, "Klaus", 23, "Zeus"));
    students.add(new Student(4711, "Klaus", 23, "Zeus"));

    System.out.println("Anzahl Studierende: " + students.size());

    for(Student currentStudent : students){
      System.out.println(currentStudent);
    }

    Object test;


  }
}
