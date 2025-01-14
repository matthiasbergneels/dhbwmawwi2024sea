package lecture.chapter7.nameconflict;

public class Conflicting implements Aable, Bable{

  public void stupidPrint(){
    Aable.super.stupidPrint();
    Bable.super.stupidPrint();
  }

}
