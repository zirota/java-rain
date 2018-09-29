package rain;

import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color;

public class Rain {
  // Coordinates
  int x;
  int y;
  int length;
  int yspeed;
  int panelWidth;
  int panelHeight;

  public Rain(int panelWidth, int panelHeight) {
    this.panelWidth = panelWidth;
    this.panelHeight = panelHeight;
    this.x = (int) (Math.random() * panelWidth) + 1;
    this.y = (int) (Math.random() * panelHeight);
    this.length = (int) (Math.random() * 7) + 2;
    this.yspeed = (int) (Math.random() * 3) + 7;
  }

  /* Increases the y coordinates of the rain object
   * Reset the y coordinates when end of screen
   */
  public void drop() {
    y = y + yspeed;
    if (y > this.panelHeight) {
      y = 0;
    }
  }

  // Set the color and size of the raindrop
  public void draw(Graphics2D g2) {
    // Sets the context before drawing
    g2.setStroke(new BasicStroke(2));
    g2.setColor(new Color(255, 0, 0));
    //Testing github etc just random comment here
    g2.drawLine(x, y, x, y + length);
    drop();
  }
}