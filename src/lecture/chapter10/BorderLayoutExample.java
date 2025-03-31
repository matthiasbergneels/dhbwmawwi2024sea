package lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {

  public BorderLayoutExample() {
    this.setTitle("BorderLayoutExample");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.setLayout(new BorderLayout(5,5));

    JPanel centerPanel = new JPanel();
    centerPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
    centerPanel.add(new JButton("Center"));

    JPanel northPanel = new JPanel();
    northPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
    northPanel.add(new JButton("North"));

    this.add(centerPanel, BorderLayout.CENTER);
    this.add(new JButton("South"), BorderLayout.SOUTH);
    this.add(northPanel, BorderLayout.NORTH);
    this.add(new JButton("East"), BorderLayout.EAST);
    this.add(new JButton("West"), BorderLayout.WEST);


    this.pack();
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new BorderLayoutExample();
  }

}
