import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Get the number of integers from the user
        System.out.println("Enter the number of integers: ");
        int n = scanner.nextInt();

        // Accept N integers from the user and store them in the LinkedList
        for (int i = 0; i < n; i++) {
            System.out.println("Enter integer " + (i + 1) + ": ");
            int num = scanner.nextInt();
            list.add(num);
        }

        // Display the negative integers
        System.out.println("Negative integers: ");
        for (int num : list) {
            if (num < 0) {
                System.out.println(num);
            }
        }
    }
}
