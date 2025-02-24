package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HotelTest {

  private Hotel hotelUnderTest;

  @BeforeEach
  void setUp() {
    hotelUnderTest = new Hotel(100);
  }

  @Test
  void bookSlots() {
    // Arrange
    NotEnoughFreeSlotsException notEnoughFreeSlotsException = null;

    // Act

    try {
      hotelUnderTest.bookSlots(hotelUnderTest.freeSlots() + 1);
    }catch (NotEnoughFreeSlotsException e){
      notEnoughFreeSlotsException = e;
    }catch (Exception e){

    }

    // Assert
    Assertions.assertNotNull(notEnoughFreeSlotsException);
  }

  @Test
  void bookSlotsWithException() {
    // Arrange
    HotelExceptionTestHelper hotelExceptionTestHelper = new HotelExceptionTestHelper(hotelUnderTest);

    NotEnoughFreeSlotsException e = Assertions.assertThrows(NotEnoughFreeSlotsException.class, hotelExceptionTestHelper);


  }

  @Test
  void bookSlotsWithExceptionLambdaVariant() {
    // Arrange


    NotEnoughFreeSlotsException e = Assertions.assertThrows(NotEnoughFreeSlotsException.class,
                                                  () -> hotelUnderTest.bookSlots(hotelUnderTest.freeSlots() + 1));


  }
}