package rain;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RainPanel extends JPanel {
  private int width;
  private int height;
  private Rain[] raindrops;

  public RainPanel(Rain[] raindrops, int width, int height) {
    this.width = width;
    this.height = height;
    this.raindrops = raindrops;
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    // Cast to Graphics2D to use the class
    Graphics2D g2 = (Graphics2D) g;
    
    for(Rain raindrop : raindrops) {
      raindrop.draw(g2);
    }
  }

}