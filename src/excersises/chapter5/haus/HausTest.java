package excersises.chapter5.haus;

public class HausTest {

  public static void main(String[] args) {

    int fenster = 50;
    Haus[] haeuser = {new Haus(),
                      new Haus(Haus.DEFAULT_TUEREN_ANZAHL, Haus.DEFAULT_FENSTER_ANZAHL, 3, 250.0, "Coblitzallee", "7", 61234, "Mannheim", true),
                      new Haus(10, 100, 3, 250.0, null, "7", 61234, "Mannheim", true),
                      new Haus((byte)fenster),
                      new Haus(Haus.BuildType.TUEREN, 11),
                      Haus.baueHausMitTueren(99)};

    for(Haus currentHaus : haeuser){
      System.out.println("Das Haus hat " + currentHaus.getTueren() + " Türen, "
                                        + currentHaus.getFenster() + " Fenster");
    }
  }
}
