package lecture.chapter7;

public class Airplane implements Bookable{
  private boolean[] bookedSeats;

  public Airplane(int seatCount){
    bookedSeats = new boolean[seatCount];
  }

  public void fly(){
    System.out.println("Und ich flieg, flieg, flieg... *sing*");
  }

}
