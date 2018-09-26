package rain;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rain extends JPanel {
  // Coordinates
  int x;
  int y;
  int length;
  int yspeed;
  Graphics2D g2;

  public Rain() {
    this.x = (int) (Math.random() * 640) + 1;
    this.y = 0;
    this.length = (int) (Math.random() * 7) + 2;
    this.yspeed = (int) (Math.random() * 5) + 1;
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    // Cast to Graphics2D to use the class
    g2 = (Graphics2D) g;
    draw();
  }

  public void drop() {
    y = y + yspeed;
    if (y > 360) {
      y = 0;
    }
  }

  public void draw() {
    // Sets the context before drawing
    g2.setStroke(new BasicStroke(2));
    g2.setColor(new Color(255, 0, 123));
    g2.drawLine(x, y, x, y + 5);
    drop();
  }
}