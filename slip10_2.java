import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DisplayFirstRecord extends JFrame implements ActionListener {

    private JTextField RNoTextField;
    private JTextField SNameTextField;
    private JTextField PerTextField;
    private JButton displayButton;

    public DisplayFirstRecord() {
        super("Display First Record");

        // Create the TextFields
        RNoTextField = new JTextField(10);
        SNameTextField = new JTextField(10);
        PerTextField = new JTextField(10);

        // Create the Button
        displayButton = new JButton("Display");

        // Add the components to the frame
        JPanel panel = new JPanel();
        panel.add(new JLabel("RNo:"));
        panel.add(RNoTextField);
        panel.add(new JLabel("SName:"));
        panel.add(SNameTextField);
        panel.add(new JLabel("Per:"));
        panel.add(PerTextField);
        panel.add(displayButton);

        add(panel);

        // Add the action listener to the button
        displayButton.addActionListener(this);

        // Set the size of the frame
        setSize(300, 150);

        // Make the frame visible
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        // Get the first record from the student table
        String query = "SELECT * FROM student ORDER BY RNo ASC LIMIT 1";

        // Execute the query
        ResultSet rs = stmt.executeQuery(query);

        // Get the values from the result set
        int RNo = rs.getInt("RNo");
        String SName = rs.getString("SName");
        int Per = rs.getInt("Per");

        // Set the values in the TextFields
        RNoTextField.setText(String.valueOf(RNo));
        SNameTextField.setText(SName);
        PerTextField.setText(String.valueOf(Per));
    }

    public static void main(String[] args) {
        new DisplayFirstRecord();
    }
}
