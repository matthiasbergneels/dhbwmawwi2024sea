package lecture.chapter7;

import lecture.chapter8.DontLike13;
import lecture.chapter8.NegativSlotsException;
import lecture.chapter8.NotEnoughFreeSlotsException;

public interface Bookable {

  int freeSlots();
  void bookSlots(int slots) throws NotEnoughFreeSlotsException, DontLike13, NegativSlotsException;
  default boolean reserveSlots(int slots){
    return false;
  }
}
