import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class ProjectTable extends JFrame {

    private JTable table;
    private DefaultTableModel model;

    public ProjectTable() {

        // Create the table model
        model = new DefaultTableModel();
        model.addColumn("Project ID");
        model.addColumn("Project Name");
        model.addColumn("Project Description");
        model.addColumn("Project Status");

        // Create the table
        table = new JTable(model);

        // Add the table to the frame
        add(table);

        // Set the size of the frame
        setSize(500, 500);

        // Show the frame
        setVisible(true);
    }

    public static void main(String[] args) {

        // Create a new instance of the ProjectTable class
        ProjectTable projectTable = new ProjectTable();

        // Insert some values into the table
        projectTable.insertValue(1, "Project 1", "This is the first project.", "In Progress");
        projectTable.insertValue(2, "Project 2", "This is the second project.", "Completed");
        projectTable.insertValue(3, "Project 3", "This is the third project.", "On Hold");

        // Display all the details of the PROJECT table in a tabular format on the screen
        projectTable.displayTable();
    }

    private void insertValue(int projectId, String projectName, String projectDescription, String projectStatus) {

        // Create a new row
        Object[] row = new Object[4];
        row[0] = projectId;
        row[1] = projectName;
        row[2] = projectDescription;
        row[3] = projectStatus;

        // Add the row to the table model
        model.addRow(row);
    }

    private void displayTable() {

        // Get the number of rows in the table
        int rowCount = model.getRowCount();

        // Create a new String array to store the table data
        String[] tableData = new String[rowCount];

        // Iterate over the rows in the table and add the data to the array
        for (int i = 0; i < rowCount; i++) {

            tableData[i] = model.getValueAt(i, 0) + " | " + model.getValueAt(i, 1) + " | " + model.getValueAt(i, 2) + " | " + model.getValueAt(i, 3);
        }

        // Create a new JDialog to display the table data
        JDialog dialog = new JDialog();
        dialog.setTitle("Project Table");

        // Create a new JTextArea to display the table data
        JTextArea textArea = new JTextArea();
        textArea.setText(String.join("\n", tableData));

        // Add the text area to the dialog
        dialog.add(textArea);

        // Set the size of the dialog
        dialog.setSize(500, 500);

        // Show the dialog
        dialog.setVisible(true);
    }
}
