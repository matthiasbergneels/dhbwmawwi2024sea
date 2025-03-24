package lecture.chapter9;

import java.util.Comparator;

public class SortStudentByNameLength implements Comparator<Student> {

  public int compare(Student s1, Student s2) {
    int student1CharCountInNames = s1.getFamilyName().length() + s1.getName().length();
    int student2CharCountInNames = s2.getFamilyName().length() + s2.getName().length();

    return student1CharCountInNames - student2CharCountInNames;
  }

}
