package lecture.chapter9;

import java.util.Objects;

public class Student implements Comparable<Student> {

  private int studentId;
  private String name;
  private int age;
  private String familyName;
  private double gradeAverage;

  public Student(int studentId, String name, int age, String familyName) {
    this.studentId = studentId;
    this.name = name;
    this.age = age;
    this.familyName = familyName;
  }

  public int getStudentId() {
    return studentId;
  }

  public void setStudentId(int studentId) {
    this.studentId = studentId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  @Override
  public int compareTo(Student s) {
    if(this.studentId != s.studentId) {
      return this.studentId - s.studentId;
    }

    if(!this.familyName.equals(s.familyName)) {
      return this.familyName.compareTo(s.familyName);
    }

    if(!this.name.equals(s.name)) {
      return this.name.compareTo(s.name);
    }

    if(this.age != s.age) {
      return this.age - s.age;
    }

    return 0;
  }


  @Override
  public boolean equals(Object o){
    if(this == o) {
      return true;
    }

    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Student student = (Student) o;
    if(studentId != student.studentId) {
      return false;
    }
    if(!familyName.equals(student.familyName)) {
      return false;
    }
    if(!name.equals(student.name)) {
      return false;
    }
    if(age != student.age) {
      return false;
    }
    return true;
  }

  /*
  public int hashCode(){
    return this.studentId ^ this.familyName.hashCode() ^ this.name.hashCode() ^ this.age;
  }

   */

  @Override
  public int hashCode() {
    int result = studentId;
    result = 31 * result + Objects.hashCode(name);
    result = 31 * result + age;
    result = 31 * result + Objects.hashCode(familyName);
    result = 31 * result + Double.hashCode(gradeAverage);
    return result;
  }

  /*
  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Student student = (Student) o;
    return studentId == student.studentId && age == student.age && Objects.equals(name, student.name) &&
      Objects.equals(familyName, student.familyName);
  }

   */


  @Override
  public String toString() {
    return "Student{" +
      "studentId=" + studentId +
      ", name='" + name + '\'' +
      ", age=" + age +
      ", familyName='" + familyName + '\'' +
      '}';
  }
}
