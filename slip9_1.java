import java.awt.*;
import javax.swing.*;

public class BallMover extends JFrame {

    private JPanel panel;
    private JButton startButton;
    private Ball ball;

    public BallMover() {
        panel = new JPanel();
        startButton = new JButton("Start");
        ball = new Ball();

        panel.add(ball);
        add(panel, BorderLayout.CENTER);
        add(startButton, BorderLayout.SOUTH);

        startButton.addActionListener(e -> {
            new Thread(() -> {
                while (true) {
                    ball.move();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    }
                }
            }).start();
        });

        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BallMover();
    }
}

class Ball extends JPanel {

    private int x;
    private int y;

    public Ball() {
        x = 0;
        y = 0;
    }

    public void move() {
        y += 1;
        if (y >= getHeight()) {
            y = 0;
        }
        repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x, y, 10, 10);
    }
}
