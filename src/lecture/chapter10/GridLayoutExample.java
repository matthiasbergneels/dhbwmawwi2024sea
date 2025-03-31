package lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {

  public GridLayoutExample() {
    this.setTitle("GridLayoutExample");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    this.setLayout(new GridLayout(0,3));

    this.add(new JLabel("Cell 1"));
    this.add(new JLabel("Cell 2"));
    this.add(new JLabel("Cell 3"));
    this.add(new JLabel("Cell 4"));
    this.add(new JLabel("Cell 5"));
    this.add(new JLabel("Cell 6"));
    this.add(new JLabel("Cell 7"));
    this.add(new JLabel("Cell 8"));
    this.add(new JLabel("Cell 9"));
    this.add(new JLabel("Cell 10000000000000000000000000000"));
    this.add(new JLabel("Cell 11"));
    this.add(new JLabel("Cell 12"));
    this.add(new JLabel("Cell 13"));
    this.add(new JLabel("Cell 14"));
    this.add(new JButton("Cell15"));

    JPanel cell16Panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    cell16Panel.add(new JButton("Cell 16"));
    this.add(cell16Panel);




    this.pack();
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new GridLayoutExample();
  }
}
