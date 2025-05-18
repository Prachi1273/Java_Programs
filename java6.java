import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class java6 extends JFrame
{
    public JRadioButton circleBtn, rectangleBtn, squareBtn;
    public JCheckBox areaChk, perimeterChk, circumferenceChk;
    public JTextField radiusField, lengthField, widthField, sideField;
    public JButton calculateBtn, exitBtn;
    public JLabel radiusLabel, lengthLabel, widthLabel, sideLabel, resultLabel;
    public JPanel shapePanel, optionsPanel, inputPanel, buttonPanel;

    public java6() {
        setTitle("Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        shapePanel = new JPanel();
        circleBtn = new JRadioButton("Circle");
        rectangleBtn = new JRadioButton("Rectangle");
        squareBtn = new JRadioButton("Square");
        ButtonGroup shapeGroup = new ButtonGroup();
        shapeGroup.add(circleBtn);
        shapeGroup.add(rectangleBtn);
        shapePanel.add(circleBtn);
        shapePanel.add(rectangleBtn);
        shapePanel.add(squareBtn);
        add(shapePanel);

        optionsPanel = new JPanel();
        areaChk = new JCheckBox("Area");
        perimeterChk = new JCheckBox("Perimeter");
        circumferenceChk = new JCheckBox("Circumference");
        optionsPanel.add(areaChk);
        optionsPanel.add(perimeterChk);
        optionsPanel.add(circumferenceChk);
        add(optionsPanel);

        inputPanel = new JPanel(new GridLayout(4, 2));
        radiusLabel = new JLabel("Radius:");
        radiusField = new JTextField(10);
        lengthLabel = new JLabel("Length:");
        lengthField = new JTextField(10);
        widthLabel = new JLabel("Width:");
        widthField = new JTextField(10);
        sideLabel = new JLabel("Side:");
        sideField = new JTextField(10);

        inputPanel.add(radiusLabel);
        inputPanel.add(radiusField);
        inputPanel.add(lengthLabel);
        inputPanel.add(lengthField);
        inputPanel.add(widthLabel);
        inputPanel.add(widthField);
        inputPanel.add(sideLabel);
        inputPanel.add(sideField);
        add(inputPanel);

        buttonPanel = new JPanel();
        calculateBtn = new JButton("Calculate");
        exitBtn = new JButton("Exit");
        resultLabel = new JLabel("Result: ");
        buttonPanel.add(calculateBtn);
        buttonPanel.add(exitBtn);
        buttonPanel.add(resultLabel);
        add(buttonPanel);

        circleBtn.addActionListener(e -> handleShapeSelection("Circle"));
        rectangleBtn.addActionListener(e -> handleShapeSelection("Rectangle"));
        squareBtn.addActionListener(e -> handleShapeSelection("Square"));

        calculateBtn.addActionListener(e -> performCalculation());
        exitBtn.addActionListener(e -> System.exit(0));

        handleShapeSelection("Circle");

        setVisible(true);
    }

    public void handleShapeSelection(String shape) {
        radiusLabel.setVisible(false);
        radiusField.setVisible(false);
        lengthLabel.setVisible(false);
        lengthField.setVisible(false);
        widthLabel.setVisible(false);
        widthField.setVisible(false);
        sideLabel.setVisible(false);
        sideField.setVisible(false);

        areaChk.setEnabled(false);
        perimeterChk.setEnabled(false);
        circumferenceChk.setEnabled(false);

        switch (shape) {
            case "Circle":
                radiusLabel.setVisible(true);
                radiusField.setVisible(true);
                areaChk.setEnabled(true);
                circumferenceChk.setEnabled(true);
                break;
            case "Rectangle":
                lengthLabel.setVisible(true);
                lengthField.setVisible(true);
                widthLabel.setVisible(true);
                widthField.setVisible(true);
                areaChk.setEnabled(true);
                perimeterChk.setEnabled(true);
                break;
            case "Square":
                sideLabel.setVisible(true);
                sideField.setVisible(true);
                areaChk.setEnabled(true);
                perimeterChk.setEnabled(true);
                break;
        }
    }

    public void performCalculation() {
        double result = 0.0;
        StringBuilder output = new StringBuilder("Result: ");

        try {
            if (circleBtn.isSelected()) {
                if (radiusField.getText().isEmpty()) throw new NumberFormatException();
                double radius = Double.parseDouble(radiusField.getText());
                if (areaChk.isSelected()) output.append("Area = ").append(Math.PI * radius * radius).append(" | ");
                if (circumferenceChk.isSelected()) output.append("Circumference = ").append(2 * Math.PI * radius).append(" | ");
            }
            else if (rectangleBtn.isSelected()) {
                if (lengthField.getText().isEmpty() || widthField.getText().isEmpty()) throw new NumberFormatException();
                double length = Double.parseDouble(lengthField.getText());
                double width = Double.parseDouble(widthField.getText());
                if (areaChk.isSelected()) output.append("Area = ").append(length * width).append(" | ");
                if (perimeterChk.isSelected()) output.append("Perimeter = ").append(2 * (length + width)).append(" | ");
            }
            else if (squareBtn.isSelected()) {
                if (sideField.getText().isEmpty()) throw new NumberFormatException();
                double side = Double.parseDouble(sideField.getText());
                if (areaChk.isSelected()) output.append("Area = ").append(side * side).append(" | ");
                if (perimeterChk.isSelected()) output.append("Perimeter = ").append(4 * side).append(" | ");
            }

            resultLabel.setText(output.toString());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid input!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new java6();
}
}
