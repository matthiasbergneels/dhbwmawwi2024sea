package excersises.chapter7.smarthome;


public class HomeManager {
  public void shutdown(HomeControllable[] devices) {
    for (HomeControllable device : devices) {
      device.turnOff();
    }
  }

  public static void main(String[] args) {
    // Erstellen von Haushaltsgeräten
    CeilingLamp lamp1 = new CeilingLamp(Room.LIVING_ROOM);
    CeilingLamp lamp2 = new CeilingLamp(Room.BEDROOM);
    VacuumCleaner vacuum = new VacuumCleaner();
    CoffeeMachine coffeeMachine = new CoffeeMachine();
    Television television = new Television();

    // Hinzufügen der Geräte zu einer Liste
    HomeControllable[] devices = {lamp1, lamp2, vacuum, coffeeMachine, television};

    // Einschalten aller Geräte
    for (HomeControllable device : devices) {
      device.turnOn();
    }

    System.out.println("\nAlle Geräte werden ausgeschaltet...");
    // Ausschalten aller Geräte
    new HomeManager().shutdown(devices);
  }
}
