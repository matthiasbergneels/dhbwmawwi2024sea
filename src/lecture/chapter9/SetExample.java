package lecture.chapter9;

import com.sun.source.tree.Tree;

import java.util.*;

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

    students.add(new Student(4711, "Anna", 21, "MüllermitM"));
    students.add(new Student(5813, "Klaus", 23, "Zeus"));
    students.add(new Student(2138, "Aneta", 25, "Frech"));
    students.add(new Student(9999, "Klaus", 23, "Zeus"));
    students.add(new Student(0001, "Klaus", 23, "Zeus"));
    students.add(new Student(4711, "Klaus", 23, "Zeus"));

    System.out.println("Anzahl Studierende: " + students.size());

    for(Student currentStudent : students){
      System.out.println(currentStudent);
    }


    Set<Student> studentsSortedByNameLength = new TreeSet<>(new SortStudentByNameLength());

    /*
    for(Student currentStudent : students){
      studentsSortedByNameLength.add(currentStudent);
    }
     */

    studentsSortedByNameLength.addAll(students);

    System.out.println("Student by Namelength: " + studentsSortedByNameLength.size());
    for(Student currentStudent : studentsSortedByNameLength){
      System.out.println(currentStudent);
    }




    // Sorting with Lists

    List<Student> studentList = new ArrayList<>();
    studentList.addAll(students);

    System.out.println("Student list - initial sortiert:");
    for(Student currentStudent : studentList){
      System.out.println(currentStudent);
    }

    studentList.sort(new SortStudentByNameLength());
    System.out.println("Student list - nach Namenslänge sortiert:");
    for(Student currentStudent : studentList){
      System.out.println(currentStudent);
    }

    Collections.sort(studentList);
    System.out.println("Student list - initial sortiert:");
    for(Student currentStudent : studentList){
      System.out.println(currentStudent);
    }

    Collections.sort(studentList, new SortStudentByAge());
    System.out.println("Student list - nach Alter sortiert:");
    for(Student currentStudent : studentList){
      System.out.println(currentStudent);
    }

    // Sort by Age --> Anonyme Klasse
    Collections.sort(studentList, new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
      }
    });

    Collections.sort(studentList, (s1, s2) -> s1.getStudentId() - s2.getStudentId());
    System.out.println("Student list - nach MatrikelNummer sortiert:");
    for(Student currentStudent : studentList){
      System.out.println(currentStudent);
    }

    Collections.sort(studentList, Student.SORT_BY_GRADE);
    System.out.println("Student list - nach Average Grade sortiert:");
    for(Student currentStudent : studentList){
      System.out.println(currentStudent);
    }



  }
}
