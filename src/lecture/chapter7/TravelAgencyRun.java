package lecture.chapter7;

public class TravelAgencyRun {

  public static void main(String[] args) {

    Hotel grandHotel = new Hotel(150);
    Airplane a380 = new Airplane(380);

    a380.fly();
    grandHotel.clean();

    Bookable[] vacationBookings = new Bookable[4];

    // Narrowing Cast
    vacationBookings[0] = grandHotel;
    vacationBookings[1] = a380;
    vacationBookings[2] = new Hotel(75);
    vacationBookings[3] = new Airplane(70);

    for(Bookable bookable : vacationBookings) {
      // Alle Methodenaufrufe über die Bookable Referenz --> Polymorphie!
      System.out.println("Freie Plätze: " + bookable.freeSlots());
      boolean successfullBooking = bookable.bookSlots(73);
      if(successfullBooking){
        System.out.println("Buchung hat geklappt - verbleibende Plätze " + bookable.freeSlots());
      }else {
        System.out.println("Buchung war nicht erfolgreich!");
      }

      // Widening Cast
      if(bookable instanceof Hotel currentHotel){
        currentHotel.clean();
      }
    }


  }
}
