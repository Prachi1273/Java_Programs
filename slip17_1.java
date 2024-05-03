import java.util.*;

public class SortAndRemoveDuplicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept 'N' integers from the user
        System.out.println("Enter the number of integers you want to enter: ");
        int n = scanner.nextInt();

        // Create a LinkedHashSet to store the integers
        LinkedHashSet<Integer> integers = new LinkedHashSet<>();

        // Add the integers to the LinkedHashSet
        System.out.println("Enter the integers: ");
        for (int i = 0; i < n; i++) {
            integers.add(scanner.nextInt());
        }

        // Sort the integers in ascending order
        List<Integer> sortedIntegers = new ArrayList<>(integers);
        Collections.sort(sortedIntegers);

        // Display the sorted integers
        System.out.println("The sorted integers are: ");
        for (int integer : sortedIntegers) {
            System.out.println(integer);
        }
    }
}
