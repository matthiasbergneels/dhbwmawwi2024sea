package lecture.chapter7;

public interface Bookable {

  int freeSlots();
  boolean bookSlots(int slots);
  default boolean reserveSlots(int slots){
    return false;
  }
}
