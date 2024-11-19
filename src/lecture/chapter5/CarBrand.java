package lecture.chapter5;

public enum CarBrand {
  MERCEDES("$$$"),
  FIAT("$"),
  BMW("$$$"),
  PEUGEOT("$"),
  TESLA("$$"),
  MITSUBISHI("$"),
  FERRARI("$$$$$");

  private String priceRange;

  CarBrand(String priceRange){
    this.priceRange = priceRange;
  }

  public String getPriceRange() {
    return priceRange;
  }


}
