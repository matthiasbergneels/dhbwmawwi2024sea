package lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample extends JFrame {

  public FlowLayoutExample() {
    this.setTitle("FlowLayoutExample");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    FlowLayout myFlowLayout = new FlowLayout();
    this.setLayout(myFlowLayout);

    this.add(new JLabel("Das ist der Juhu-Button -->"));
    this.add(new JButton("Juhu!"));
    this.add(new JTextField(15));

    this.pack();
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new FlowLayoutExample();
  }

}
