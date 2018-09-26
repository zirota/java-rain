package rain;

import javax.swing.JFrame;

public class App {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Rain App");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(640, 360);
    frame.setVisible(true);
    // Rain r = new Rain();
    // frame.add(r);
    Rain[] raindrops = new Rain[1000];
    for (int i = 0; i < raindrops.length; i += 1) {
      raindrops[i] = new Rain();
    }
    
    for (Rain r: raindrops) {
      frame.add(r);
    }
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