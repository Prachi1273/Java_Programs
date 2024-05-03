import java.util.*;

public class LinkedListExample {

    public static void main(String[] args) {
        // Create a LinkedList of integer objects
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add an element at the first position
        linkedList.addFirst(10);

        // Delete the last element
        linkedList.removeLast();

        // Display the size of the linked list
        System.out.println("Size of the linked list: " + linkedList.size());

        // Print the contents of the linked list
        System.out.println("Contents of the linked list: ");
        Iterator<Integer> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
