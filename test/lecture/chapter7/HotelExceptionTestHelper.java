package lecture.chapter7;

import org.junit.jupiter.api.function.Executable;

public class HotelExceptionTestHelper implements Executable {

  private final Hotel hotel;

  public HotelExceptionTestHelper(Hotel hotel) {
    this.hotel = hotel;
  }

  @Override
  public void execute() throws Throwable {
    hotel.bookSlots(hotel.freeSlots() + 1);
  }

}
