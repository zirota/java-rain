package rain;

import java.awt.*;

public class Rain {
  // Coordinates
  int x;
  int y;
  int length;
  int yspeed;

  // FIXME: Try not to hard code the height
  public Rain() {
    this.x = (int) (Math.random() * 640) + 1;
    this.y = (int) (Math.random() * 360);
    this.length = (int) (Math.random() * 7) + 2;
    this.yspeed = (int) (Math.random() * 3) + 7;
  }

  public void drop() {
    y = y + yspeed;
    if (y > 360) {
      y = 0;
    }
  }

  public void draw(Graphics2D g2) {
    // Sets the context before drawing
    g2.setStroke(new BasicStroke(2));
    g2.setColor(new Color(255, 0, 123));
    g2.drawLine(x, y, x, y + length);
    drop();
  }
}