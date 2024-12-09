package excersises.chapter7.smarthome;

public class VacuumCleaner implements HomeControllable {
  @Override
  public void turnOn() {
    System.out.println("Der Staubsauger wurde angeschaltet.");
  }

  @Override
  public void turnOff() {
    System.out.println("Der Staubsauger wurde ausgeschaltet.");
  }
}
