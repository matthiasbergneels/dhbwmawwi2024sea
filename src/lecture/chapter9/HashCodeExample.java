package lecture.chapter9;

public class HashCodeExample {

  private int intData;
  private String objectData;
  private boolean booleanData;
  private long longData;
  private float floatData;
  private double doubleData;

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;

    HashCodeExample that = (HashCodeExample) o;
    return intData == that.intData && booleanData == that.booleanData && longData == that.longData && Float.compare(floatData, that.floatData) == 0 && Double.compare(doubleData, that.doubleData) == 0 && objectData.equals(that.objectData);
  }

  @Override
  public int hashCode() {
    int result = intData;
    result = 31 * result + objectData.hashCode();
    result = 31 * result + Boolean.hashCode(booleanData);
    result = 31 * result + Long.hashCode(longData);
    result = 31 * result + Float.hashCode(floatData);
    result = 31 * result + Double.hashCode(doubleData);
    return result;
  }



  /*
  @Override
  public int hashCode(){

    int hashCode = 17;

    hashCode = hashCode ^ intData;
    hashCode = hashCode ^ (objectData != null ? objectData.hashCode() : 0);
    hashCode = hashCode ^ (booleanData ? 1 : 0);
    //hashCode = hashCode ^ (int)longData;
    hashCode = hashCode ^ ((int)(longData>>>32) ^ (int)(longData & 0xFFFFFFFF));
    //hashCode = hashCode ^ (int)floatData;
    hashCode = hashCode ^ ((floatData==0.0F) ? 0 : Float.floatToIntBits(floatData));
    //hashCode = hashCode ^ (int)doubleData;
    long doubleAsLongBits = Double.doubleToLongBits(doubleData);
    hashCode = hashCode ^ ((int)(doubleAsLongBits>>>32) ^ (int)(doubleAsLongBits & 0xFFFFFFFF));


    return hashCode;
  }

   */
}
