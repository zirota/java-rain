package rain;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RainPanel extends JPanel {

  public RainPanel() {
    // Set the dimensions of the panel
    setLayout(new GridLayout(1, 1));
    setPreferredSize(new Dimension(640, 320));
    setBackground(new Color(99, 98, 98));

    // Timer to repaint every 60ms (this allows the object to move)
    Timer timer = new Timer(60, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        repaint();
      }
    });
    timer.start();
  }

  // Paint component will paint the specified components in the panel
  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // An array of raindrops
    Rain[] raindrops = new Rain[1000];
    for (int i = 0; i < raindrops.length; i += 1) {
      raindrops[i] = new Rain(this.getWidth(), this.getHeight());
    }
    // Cast to Graphics2D to use the class
    Graphics2D g2 = (Graphics2D) g;
    
    for(Rain raindrop : raindrops) {
      raindrop.draw(g2);
    }
  }
}