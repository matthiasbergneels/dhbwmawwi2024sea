package excersises.chapter7.smarthome;

public class CeilingLamp implements HomeControllable {
  private Room room;

  public CeilingLamp(Room room) {
    this.room = room;
  }

  @Override
  public void turnOn() {
    System.out.println("Die Lampe im " + room.getGermanName() + " wurde angeschaltet.");
  }

  @Override
  public void turnOff() {
    System.out.println("Die Lampe im " + room.getGermanName() + " wurde ausgeschaltet.");
  }
}
