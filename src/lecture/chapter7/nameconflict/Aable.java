package lecture.chapter7.nameconflict;

public interface Aable {
  default void stupidPrint(){
    System.out.println("Aable printing");
  }
}
