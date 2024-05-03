import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ScrollingText extends Applet implements KeyListener {

    private String text;
    private int x;

    public void init() {
        text = "This is the text that will be scrolled.";
        x = 0;
        addKeyListener(this);
    }

    public void paint(Graphics g) {
        g.drawString(text, x, 50);
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            x--;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            x++;
        }
        repaint();
    }

    public void keyReleased(KeyEvent e) {
    }
}
