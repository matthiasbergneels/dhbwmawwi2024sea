package excersises.chapter5.haus;

public class HausBuilder {

  private Haus neuesHaus;

  public HausBuilder() {
    this.neuesHaus = new Haus();
  }

  public HausBuilder setFenster(int fenster){
    this.neuesHaus.setFenster(fenster);
    return this;
  }

  public HausBuilder setTueren(int tueren){
    this.neuesHaus.setTueren(tueren);
    return this;
  }

  public HausBuilder setEtagen(int etagen){
    this.neuesHaus.setEtagen(etagen);
    return this;
  }

  public HausBuilder setFlaeche(double flaeche){
    this.neuesHaus.setFlaeche(flaeche);
    return this;
  }

  public HausBuilder setAdresse(String straße, String hausnummer, int plz, String ort){
    neuesHaus.setStraße(straße);
    neuesHaus.setHausnummer(hausnummer);
    neuesHaus.setPlz(plz);
    neuesHaus.setOrt(ort);

    return this;
  }

  public HausBuilder baueFlachDach(){
    this.neuesHaus.setFlachDach(true);
    return this;
  }

  public Haus finalizeHaus(){
    return this.neuesHaus;
  }

}
