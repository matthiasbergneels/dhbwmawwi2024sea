package lecture.chapter7;

public class Airplane implements Bookable{
  private boolean[] bookedSeats;

  public Airplane(int seatCount){
    bookedSeats = new boolean[seatCount];
  }

  public void fly(){
    System.out.println("Und ich flieg, flieg, flieg... *sing*");
  }

  @Override
  public int freeSlots() {
    int freeSlots = 0;
    for(boolean bookedSeat : bookedSeats){
      if(!bookedSeat){
        freeSlots++;
      }
    }
    return freeSlots;
  }

  @Override
  public boolean bookSlots(int slots) {
    if(slots > freeSlots()){
      return false;
    }

    for(int i = 0; i < bookedSeats.length; i++){
      if(!bookedSeats[i]){
        bookedSeats[i] = true;
        slots--;
      }

      if(slots == 0){
        break;
      }
    }
    return true;
  }
}
