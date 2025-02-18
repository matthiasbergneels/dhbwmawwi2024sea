package lecture.chapter7;

import lecture.chapter8.DontLike13;
import lecture.chapter8.NegativSlotsException;
import lecture.chapter8.NotEnoughFreeSlotsException;

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
      int slotsToBook = -73;
      try {
        bookable.bookSlots(slotsToBook);
        System.out.println("Buchung Erfolgreich - verbleibende freie Plätze: " + bookable.freeSlots());
      }catch(NotEnoughFreeSlotsException e) {
        System.out.println(e.getMessage());
        try{
          bookable.bookSlots(e.getRemainingFreeSlots());
          System.out.println("Buchung Erfolgreich - verbleibende freie Plätze: " + bookable.freeSlots());
        }catch(NotEnoughFreeSlotsException e1) {
          System.out.println(e1.getMessage());
          System.out.println("Wir haben alles versucht! :-(");
        }catch(Exception e2) {
          System.out.println(e2.getMessage());
          System.out.println("Dumm gelaufen!");
        }
      } catch (NegativSlotsException e) {
        System.out.println("Buchung von weniger als 0 Plätzen nicht möglich!");
       // return;
        try{
          bookable.bookSlots(-slotsToBook);
          System.out.println("Buchung Erfolgreich - verbleibende freie Plätze: " + bookable.freeSlots());
        }catch(NotEnoughFreeSlotsException e1) {
          System.out.println(e1.getMessage());
          System.out.println("Wir haben alles versucht! :-(");
        } catch (Exception e2){
          System.out.println(e2.getMessage());
          System.out.println("Dumm gelaufen!");
        }
      } catch (DontLike13 e) {
        System.out.println(e.getMessage());
        System.out.println("Das bringt Unglück!");
      }
      finally{
        System.out.println("An mir führt kein Weg vorbei!");
        // TODO: bspw. Ressourcen aufräumen (Close())
      }
      /*if(successfullBooking){
        System.out.println("Buchung hat geklappt - verbleibende Plätze " + bookable.freeSlots());
      }else {
        System.out.println("Buchung war nicht erfolgreich!");
      }

       */

      // Widening Cast
      if(bookable instanceof Hotel currentHotel){
        currentHotel.clean();
      }
    }


  }
}
