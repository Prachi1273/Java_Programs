import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class StudentNames {

    public static void main(String[] args) {
        // Create an ArrayList to store the student names
        ArrayList<String> studentNames = new ArrayList<>();

        // Accept the number of student names from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of student names: ");
        int n = scanner.nextInt();

        // Accept the student names from the user
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of student " + (i + 1) + ": ");
            String name = scanner.next();
            studentNames.add(name);
        }

        // Display the student names using Iterator
        System.out.println("Student names using Iterator: ");
        Iterator<String> iterator = studentNames.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Display the student names using ListIterator
        System.out.println("Student names using ListIterator: ");
        ListIterator<String> listIterator = studentNames.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
