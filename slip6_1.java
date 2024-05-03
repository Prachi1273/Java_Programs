import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the number of integers they want to store in the collection
        System.out.println("Enter the number of integers you want to store in the collection:");
        int n = scanner.nextInt();

        // Create a TreeSet object to store the integers in sorted order and without duplicates
        TreeSet<Integer> integers = new TreeSet<>();

        // Read the integers from the user and add them to the collection
        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            integers.add(scanner.nextInt());
        }

        // Display the integers in sorted order
        System.out.println("The integers in sorted order are:");
        for (Integer integer : integers) {
            System.out.println(integer);
        }

        // Ask the user to enter the integer they want to search for
        System.out.println("Enter the integer you want to search for:");
        int searchElement = scanner.nextInt();

        // Use the contains() method to search for the integer in the collection
        boolean found = integers.contains(searchElement);

        // Display the result of the search
        if (found) {
            System.out.println("The integer " + searchElement + " is present in the collection.");
        } else {
            System.out.println("The integer " + searchElement + " is not present in the collection.");
        }
    }
}
