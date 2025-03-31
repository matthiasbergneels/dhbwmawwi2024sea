package lecture.excursion.innerclasses;

public class OuterClass {

  private static final String CLASS_IDENTIFIER = "OUTER_CLASS_IDENTIFIER";
  private String objectIdentifier;

  interface Printable{
    void printMessage(String message);
  }

  public OuterClass(String objectIdentifier){
    this.objectIdentifier = objectIdentifier;
  }

  public static class InnerTopLevelClass{
    public void printMessage(String message){
      System.out.println("Nachricht: " + message + " - from " + this.getClass().getName() + " ClassIdentiefier: " + CLASS_IDENTIFIER);
    }
  }

  public class InnerElementClass{
    public void printMessage(String message){
      System.out.println("Nachricht: " + message + " - from " + this.getClass().getName() + " Identifier: " + objectIdentifier);
    }
  }

  public void printMessage(String message){
    System.out.println("Nachricht: " + message + " - from " + this.getClass().getName() + " Identifier: " + this.objectIdentifier);
  }

  public void printMessageFromInnerLocalClass(String message){
    class InnerLocalClass{
      public void printMessage(String message){
        System.out.println("Nachricht: " + message + " - from " + this.getClass().getName() + " Identifier: " + objectIdentifier);
      }
    }

    InnerLocalClass myInnerLocalClass = new InnerLocalClass();
    myInnerLocalClass.printMessage(message);
  }

  public void printMessageFromSecondInnerLocalClass(String message){
    class InnerLocalClass{
      private String localClassIdentifier;

      InnerLocalClass(String localClassIdentifier){
        this.localClassIdentifier = localClassIdentifier;
      }
      public void printMessage(String message){
        System.out.println("Nachricht: " + message + " - from " + this.getClass().getName() + " Identifier: " + objectIdentifier);
      }
    }

    InnerLocalClass myInnerLocalClass = new InnerLocalClass("INNERIdentifier3121");
    myInnerLocalClass.printMessage(message);
  }

  public void printMessageFromInnerAnonymousClass(String message){
    Printable myInnerAnonymousClass = new Printable(){
      public void printMessage(String message){
        System.out.println("Nachricht: " + message + " - from " + this.getClass().getName() + " Identifier: " + objectIdentifier);
      }
    };

    Printable mySecondInnerAnonymousClass = new Printable(){
      public void printMessage(String message){
        System.out.println("Nachricht: " + message + " - from " + this.getClass().getName() + " Identifier: " + objectIdentifier);
      }
    };

    myInnerAnonymousClass.printMessage(message);
    mySecondInnerAnonymousClass.printMessage(message);
  }

  public void printMessageFromLambdaFunction(String message){

    Printable myLambdaFunction = (pMessage)->{
      System.out.println("Nachricht: " + pMessage + " - from " + this.getClass().getName() + " Identifier: " + objectIdentifier);
    };

    myLambdaFunction.printMessage(message);

  }

  public static void main(String[] args) {
    String message = "Nachricht von unseren Klassen!";

    OuterClass myOuterClass = new OuterClass("ID4711");
    OuterClass mySecondOuterClass = new OuterClass("ID5843");
    myOuterClass.printMessage(message);
    mySecondOuterClass.printMessage(message);

    // Use of Inner Top Level Class --> context Outer Class
    OuterClass.InnerTopLevelClass myInnerTopLevelClass = new OuterClass.InnerTopLevelClass();
    myInnerTopLevelClass.printMessage(message);

    // User of Inner Element Class --> context Object from Outer Class
    OuterClass.InnerElementClass myInnerElementClass = myOuterClass.new InnerElementClass();
    myInnerElementClass.printMessage(message);
    OuterClass.InnerElementClass mySecondInnerElementClass = mySecondOuterClass.new InnerElementClass();
    mySecondInnerElementClass.printMessage(message);

    myOuterClass.printMessageFromInnerLocalClass(message);
    myOuterClass.printMessageFromSecondInnerLocalClass(message);

    myOuterClass.printMessageFromInnerAnonymousClass(message);
    mySecondOuterClass.printMessageFromInnerAnonymousClass(message);

    myOuterClass.printMessageFromLambdaFunction(message);



  }

}
