package excersises.chapter7.smarthome;

public enum Room {
  LIVING_ROOM("Wohnzimmer"),
  BEDROOM("Schlafzimmer"),
  KITCHEN("Küche"),
  BATHROOM("Badezimmer");

  private final String germanName;

  Room(String germanName) {
    this.germanName = germanName;
  }

  public String getGermanName() {
    return germanName;
  }
}
