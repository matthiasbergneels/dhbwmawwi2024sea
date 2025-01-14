package excersises.chapter7.smarthome;

public class CoffeeMachine implements HomeControllable {
  @Override
  public void turnOn() {
    System.out.println("Die Kaffeemaschine wurde angeschaltet.");
  }

  @Override
  public void turnOff() {
    System.out.println("Die Kaffeemaschine wurde ausgeschaltet.");
  }
}
