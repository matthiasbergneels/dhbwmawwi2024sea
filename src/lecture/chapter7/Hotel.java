package lecture.chapter7;

public class Hotel implements Bookable {

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
  public boolean bookSlots(int slots) {
    if(slots > freeSlots()){
      return false;
    }

    bookedRooms += slots;
    return true;

  }
}
