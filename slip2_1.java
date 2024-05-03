import java.util.*;

public class ReadNames {

    public static void main(String[] args) {

        // Create a HashSet to store the names of friends
        HashSet<String> friends = new HashSet<>();

        // Read the number of friends from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of friends: ");
        int n = scanner.nextInt();

        // Read the names of friends from the user and add them to the HashSet
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of friend " + (i + 1) + ": ");
            String name = scanner.next();
            friends.add(name);
        }

        // Convert the HashSet to an ArrayList so that we can sort it
        ArrayList<String> sortedFriends = new ArrayList<>(friends);

        // Sort the ArrayList in ascending order
        Collections.sort(sortedFriends);

        // Display the sorted names of friends
        System.out.println("The names of your friends in ascending order are: ");
        for (String friend : sortedFriends) {
            System.out.println(friend);
        }
    }
}
