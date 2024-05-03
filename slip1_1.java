import java.util.*;
import java.util.Scanner;

public class slip1_1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a HashSet to store the names of friends
        HashSet<String> friends = new HashSet<>();

        // Prompt the user to enter the number of friends
        System.out.println("Enter the number of friends: ");
        int n = scanner.nextInt();

        // Read the names of friends from the user
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of friend " + (i + 1) + ": ");
            String name = scanner.next();
            friends.add(name);
        }

        // Convert the HashSet to an ArrayList to sort the names
        ArrayList<String> sortedFriends = new ArrayList<>(friends);
        Collections.sort(sortedFriends);

        // Display the names of friends in ascending order
        System.out.println("The names of your friends in ascending order are: ");
        for (String friend : sortedFriends) {
            System.out.println(friend);
        }
    }
}
