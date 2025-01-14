package excersises.chapter5.haus;

public class Haus {

  public static final int DEFAULT_TUEREN_ANZAHL = 2;
  public static final int DEFAULT_FENSTER_ANZAHL = 6;
  public static final int DEFAULT_ETAGEN_ANZAHL = 2;
  public static final String DEFAULT_STRASSE = "Hauptstraße";
  public static final double DEFAULT_FLAECHE = 80.0;
  public static final String DEFAULT_HAUSNUMMER = "1A";
  public static final int DEFAULT_PLZ = 69190;
  public static final String DEFAULT_ORT = "Walldorf";

  public enum BuildType{
    FENSTER,
    TUEREN,
    ETAGEN
  }

  private int tueren;
  private int fenster;
  private int etagen;
  private double flaeche;
  private String straße;
  private String hausnummer;
  private int plz;
  private String ort;
  private boolean flachDach;

  private static int objCount;



  // Factory-Methode Pattern für einzelne Attribute
  public static Haus baueHausMitFenstern(int fenster){
    Haus neuesHaus = new Haus();
    neuesHaus.setFenster(fenster);
    return neuesHaus;
  }

  public static Haus baueHausMitTueren(int tueren){
    Haus neuesHaus = new Haus();
    neuesHaus.setTueren(tueren);
    return neuesHaus;
  }

  public static Haus baueHausMitTuerenUndEtagen(int tueren, int etagen){
    Haus neuesHaus = new Haus();
    neuesHaus.setTueren(tueren);
    neuesHaus.setEtagen(etagen);
    return neuesHaus;
  }

  public Haus() {
    this(DEFAULT_TUEREN_ANZAHL, DEFAULT_FENSTER_ANZAHL, DEFAULT_ETAGEN_ANZAHL, DEFAULT_FLAECHE, DEFAULT_STRASSE, DEFAULT_HAUSNUMMER, DEFAULT_PLZ, DEFAULT_ORT, false);
  }

  // Türen Konstruktor
  public Haus(int tueren) {
    this(tueren, DEFAULT_FENSTER_ANZAHL, DEFAULT_ETAGEN_ANZAHL, DEFAULT_FLAECHE, DEFAULT_STRASSE, DEFAULT_HAUSNUMMER, DEFAULT_PLZ, DEFAULT_ORT, false);
  }

  // Nicht so die geilste Lösung!
  // Fenster Konstruktor
  public Haus(byte fenster) {
    this(DEFAULT_TUEREN_ANZAHL, fenster, DEFAULT_ETAGEN_ANZAHL, DEFAULT_FLAECHE, DEFAULT_STRASSE, DEFAULT_HAUSNUMMER, DEFAULT_PLZ, DEFAULT_ORT, false);
  }

  // Nicht so die geilste Lösung!
  // Etagen Konstruktor
  public Haus(short etagen) {
    this(DEFAULT_TUEREN_ANZAHL, DEFAULT_FENSTER_ANZAHL, etagen, DEFAULT_FLAECHE, DEFAULT_STRASSE, DEFAULT_HAUSNUMMER, DEFAULT_PLZ, DEFAULT_ORT, false);
  }


public Haus(BuildType buildType, int dependingOnBuildType) {
    this();
    switch(buildType) {
      case FENSTER -> setFenster(dependingOnBuildType);
      case TUEREN -> setTueren(dependingOnBuildType);
      case ETAGEN -> setEtagen(dependingOnBuildType);
    }
}


  public Haus(int tueren, int fenster, int etagen, double flaeche, String straße, String hausnummer, int plz, String ort, boolean flachDach) {
    this.setTueren(tueren);
    this.setFenster(fenster);
    this.setEtagen(etagen);
    this.setFlaeche(flaeche);
    this.setStraße(straße);
    this.setOrt(ort);
    this.setPlz(plz);
    this.setHausnummer(hausnummer);
    this.setFlachDach(flachDach);

    objCount++;
  }

  public int getTueren() {
    return tueren;
  }

  public void setTueren(int tueren) {
    if(tueren > 0) {
      this.tueren = tueren;
    } else {
      this.tueren = DEFAULT_TUEREN_ANZAHL;
    }

  }

  public int getFenster() {
    return fenster;
  }

  public void setFenster(int fenster) {
    if(fenster > 0) {
      this.fenster = fenster;
    } else {
      this.fenster = DEFAULT_FENSTER_ANZAHL;
    }
  }

  public int getEtagen() {
    return etagen;
  }

  public void setEtagen(int etagen) {
    if(etagen > 0) {
      this.etagen = etagen;
    } else {
      this.etagen = DEFAULT_ETAGEN_ANZAHL;
    }
  }

  public double getFlaeche() {
    return flaeche;
  }

  public void setFlaeche(double flaeche) {
    if(flaeche > 0) {
      this.flaeche = flaeche;
    } else {
      this.flaeche = DEFAULT_FLAECHE;
    }
  }

  public String getStraße() {
    return straße;
  }

  public void setStraße(String straße) {
    if(straße != null && straße.isBlank()){
      this.straße = straße;
    } else {
      this.straße = DEFAULT_STRASSE;
    }
  }

  public String getHausnummer() {
    return hausnummer;
  }

  public void setHausnummer(String hausnummer) {
    if(hausnummer != null && hausnummer.isBlank()){
      this.straße = hausnummer;
    } else {
      this.straße = DEFAULT_HAUSNUMMER;
    }
  }

  public int getPlz() {
    return plz;
  }

  public void setPlz(int plz) {
    if(plz > 0 && plz < 10_000) {
      this.plz = plz;
    } else {
      this.plz = DEFAULT_PLZ;
    }
  }

  public String getOrt() {
    return ort;
  }

  public void setOrt(String ort) {
    if(ort != null && ort.isBlank()){
      this.ort = ort;
    } else {
      this.ort = DEFAULT_ORT;
    }
  }

  public boolean isFlachDach() {
    return flachDach;
  }

  public void setFlachDach(boolean flachDach) {
    this.flachDach = flachDach;
  }

  public static int getObjCount() {
    return objCount;
  }
}
