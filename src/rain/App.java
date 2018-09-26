package rain;

import javax.swing.JFrame;

public class App {
  // Constants, all caps for naming convention
  public static final String TITLE = "Rain App";
  public static final int WIDTH = 640;
  public static final int HEIGHT = 360;

  public static void main(String[] args) {
    JFrame frame = new JFrame(TITLE);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(WIDTH, HEIGHT);
    frame.setVisible(true);

    Rain[] raindrops = new Rain[1000];
    for (int i = 0; i < raindrops.length; i += 1) {
      raindrops[i] = new Rain();
    }
    RainPanel rainpanel = new RainPanel(raindrops, WIDTH, HEIGHT);
    frame.add(rainpanel);

    // FIXME: Use Timer
    while (true) {
      try {
        Thread.sleep(60);
      } catch (InterruptedException e) {
        System.out.print(e);
      }
      frame.repaint();
    }
  }
}