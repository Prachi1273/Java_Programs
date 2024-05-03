import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MultithreadingExample extends JFrame implements Runnable {

    private JTextField textField;
    private JButton button;
    private int counter = 1;

    public MultithreadingExample() {
        super("Multithreading Example");

        textField = new JTextField(10);
        button = new JButton("Start");

        setLayout(new FlowLayout());
        add(textField);
        add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Thread thread = new Thread(MultithreadingExample.this);
                thread.start();
            }
        });

        setSize(300, 300);
        setVisible(true);
    }

    @Override
    public void run() {
        while (true) {
            textField.setText(String.valueOf(counter));
            counter++;

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new MultithreadingExample();
    }
}
