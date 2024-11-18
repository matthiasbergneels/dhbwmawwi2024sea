package lecture.chapter5;

public class StudentPub {
  public static void main(String[] args) {
    Student firstStudent = new Student(4711, "Klaus");
    Student secondStudent = new Student(4811, "Gabi");

    firstStudent.drink(2);
    secondStudent.drink(3);

    firstStudent.drink(0.3f, 4.9);
    secondStudent.drink(0.5f, 30*5);

    firstStudent.drink(0.2f, 10.0, 50);
    System.out.println(secondStudent);


  }
}
