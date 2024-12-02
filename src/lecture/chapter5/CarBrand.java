package lecture.chapter5;

public enum CarBrand {
  MERCEDES("$$$"),
  FIAT("$"),
  BMW("$$$"),
  PEUGEOT("$"),
  TESLA("$$"){
    @Override
    public String toString() {
      return super.toString() + " voll elektrisch";
    }
  },
  MITSUBISHI("$"),
  FERRARI("$$$$$");

  private String priceRange;

  CarBrand(String priceRange){
    this.priceRange = priceRange;
  }

  public String getPriceRange() {
    return priceRange;
  }

  @Override
  public String toString() {
    return switch(this){
      case MERCEDES -> "Mercedes";
      case FIAT -> "Fiat";
      case BMW -> "BMW";
      case PEUGEOT -> "Peugeot";
      case TESLA -> "Tesla";
      case MITSUBISHI -> "Mitsubishi";
      case FERRARI -> "Ferrari";
    };
  }


}
