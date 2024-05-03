import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

public class BlinkImage extends JFrame {

    private Image image;
    private JLabel label;
    private Timer timer;

    public BlinkImage() {
        image = Toolkit.getDefaultToolkit().getImage("image.png");
        label = new JLabel(new ImageIcon(image));
        add(label);
        timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setVisible(!label.isVisible());
            }
        });
        timer.start();
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BlinkImage();
    }
}
