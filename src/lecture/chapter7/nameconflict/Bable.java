package lecture.chapter7.nameconflict;

public interface Bable {
  default void stupidPrint(){
    System.out.println("Bable printing");
  }
}
