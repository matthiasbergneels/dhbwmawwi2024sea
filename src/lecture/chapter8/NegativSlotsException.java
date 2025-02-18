package lecture.chapter8;

public class NegativSlotsException extends Exception {
  public NegativSlotsException() {
    super("Negative Platzbuchung nicht möglich!");
  }
}
