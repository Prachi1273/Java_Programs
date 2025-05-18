import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdmissionEnquiryForm {
    public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Admission Enquiry Form");
        frame.setSize(400, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(6, 2, 10, 10));
        
        // Create labels and text fields
        JLabel nameLabel = new JLabel("Full Name:");
        JTextField nameField = new JTextField();
        
        JLabel ageLabel = new JLabel("Email:");
        JTextField ageField = new JTextField();
        
        JLabel phoneLabel = new JLabel("Phone Number:");
        JTextField phoneField = new JTextField();
        
        JLabel courseLabel = new JLabel("Select Course:");
        String[] courses = {"Computer Science", "Electronics", "Mechanical", "Civil", "Business"};
        JComboBox<String> courseBox = new JComboBox<>(courses);
        
        JButton submitButton = new JButton("Submit");
        
        // Add components to frame
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(ageLabel);
        frame.add(ageField);
        frame.add(phoneLabel);
        frame.add(phoneField);
        frame.add(courseLabel);
        frame.add(courseBox);
        frame.add(new JLabel()); // Empty placeholder
        frame.add(submitButton);
        
        // Submit button action listener
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                String phone = phoneField.getText();
                String course = (String) courseBox.getSelectedItem();
                
                // Display data in a dialog
                JOptionPane.showMessageDialog(frame, "Enquiry Details:\nName: " + name + "\nEmail: " + age + "\nPhone: " + phone + "\nCourse: " + course);
            }
        });
        
        // Set frame visibility
        frame.setVisible(true);
    }
}

