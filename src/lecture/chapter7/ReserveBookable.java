package lecture.chapter7;

public interface ReserveBookable extends Bookable {
  boolean reserveSlots(int slots);
}
