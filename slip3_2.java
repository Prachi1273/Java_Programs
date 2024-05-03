import java.util.*;

public class LinkedListExample {

    public static void main(String[] args) {

        // Create a LinkedList of String objects
        LinkedList<String> names = new LinkedList<String>();

        // Add element at the end of the list
        names.add("Brian");
        names.add("June");

        // Delete first element of the list
        names.removeFirst();

        // Display the contents of list in reverse order
        Iterator<String> itr = names.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
