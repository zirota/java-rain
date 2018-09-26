package rain;

import javax.swing.*;

public class Window extends JFrame {
  public JFrame window;

  public Window(String title, int width, int height) {
    this.window = new JFrame(title);
    this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.window.setSize(width, height);
    this.window.setVisible(true);
  }

}