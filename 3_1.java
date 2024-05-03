import java.util.Scanner;

public class SortCities {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of cities: ");
        int n = scanner.nextInt();

        String[] cities = new String[n];

        System.out.println("Enter the names of the cities: ");
        for (int i = 0; i < n; i++) {
            cities[i] = scanner.nextLine();
        }

        // Sort the cities in ascending order
        Arrays.sort(cities);

        // Print the sorted cities
        System.out.println("The sorted cities are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(cities[i]);
        }
    }
}
