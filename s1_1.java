import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        // Get the number of elements in the array from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        // Create an array to store the elements
        int[] arr = new int[n];

        // Get the elements of the array from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Print all prime numbers in the array
        System.out.println("Prime numbers in the array are:");
        for (int i = 0; i < n; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    // Check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
