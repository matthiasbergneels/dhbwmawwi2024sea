package excersises.chapter7.smarthome;

public class Television implements HomeControllable {
  @Override
  public void turnOn() {
    System.out.println("Der Fernseher wurde angeschaltet.");
  }

  @Override
  public void turnOff() {
    System.out.println("Der Fernseher wurde ausgeschaltet.");
  }
}
