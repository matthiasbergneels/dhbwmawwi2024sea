package lecture.chapter7;

import java.io.Serializable;
import lecture.chapter8.DontLike13;
import lecture.chapter8.NegativSlotsException;
import lecture.chapter8.NotEnoughFreeSlotsException;

public class Hotel implements ReserveBookable, Comparable, Serializable {

  private int rooms;
  private int bookedRooms;

  public Hotel(int rooms) {
    this.rooms = rooms;
    bookedRooms = 0;
  }

  public void clean(){
    System.out.println("Alle Räumen putzen...");
  }

  @Override
  public int freeSlots() {
    return rooms - bookedRooms;
  }

  @Override
  public void bookSlots(int slots) throws NotEnoughFreeSlotsException, NegativSlotsException, DontLike13 {
    if(slots < 0) {
      throw new NegativSlotsException();
    }

    if(slots == 13) {
      throw new DontLike13();
    }

    if(slots > freeSlots()){
      var missingSlots = new NotEnoughFreeSlotsException(slots, freeSlots());
      throw missingSlots;
    }

    bookedRooms += slots;
  }

  @Override
  public int compareTo(Object o) {
    return 0;
  }

  @Override
  public boolean reserveSlots(int slots) {
    return false;
  }
}
