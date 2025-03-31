package lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class MyFirstJFrame {

  public static void main(String[] args) {

    JFrame myFrame = new JFrame("My first JFrame");

    JButton myButton = new JButton("Juhu!!!");
    myFrame.getContentPane().add(myButton);
    myFrame.add(myButton);

    JLabel myButtonLabel = new JLabel("Der Juhu-Button --> ");
    myFrame.add(myButtonLabel);

    //myFrame.setSize(300, 200);
    myFrame.pack();
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myFrame.setVisible(true);
  }
}
