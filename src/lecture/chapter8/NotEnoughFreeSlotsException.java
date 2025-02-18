package lecture.chapter8;

public class NotEnoughFreeSlotsException extends Exception {

  private int remainingFreeSlots;

  public NotEnoughFreeSlotsException(int slotsTriedToBook, int remainingFreeSlots) {
    super("Nicht genug freie Plätze - zu buchen; " + slotsTriedToBook + "; verbleibend: " + remainingFreeSlots);
    this.remainingFreeSlots = remainingFreeSlots;
  }

  public int getRemainingFreeSlots() {
    return remainingFreeSlots;
  }

}
