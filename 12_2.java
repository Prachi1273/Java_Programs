import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator {
    private JFrame frame;
    private JTextField textField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SimpleCalculator window = new SimpleCalculator();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public SimpleCalculator() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 250, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new GridLayout(5, 4));

        textField = new JTextField();
        frame.getContentPane().add(textField);
        textField.setColumns(10);

        String[] buttons = {"1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "*", ".", "/", "0", "=", "C", "%"};

        for (String s : buttons) {
            JButton btn = new JButton(s);
            frame.getContentPane().add(btn);
            btn.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    textField.setText(textField.getText() + btn.getText());
                }
            });
        }
    }
}

