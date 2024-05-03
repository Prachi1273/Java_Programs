import java.awt.*;
import java.awt.event.*;

class BlinkText implements Runnable {
    private Frame frame;
    private Label label;

    public BlinkText(Frame frame, Label label) {
        this.frame = frame;
        this.label = label;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);
                label.setVisible(false);
                Thread.sleep(500);
                label.setVisible(true);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame("Blinking Text");
        Label label = new Label("Hello World!");
        frame.add(label);
        frame.setSize(300, 300);
        frame.setVisible(true);

        BlinkText blinkText = new BlinkText(frame, label);
        Thread thread = new Thread(blinkText);
        thread.start();
    }
}
