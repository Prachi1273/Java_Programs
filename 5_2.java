import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of rows and columns of the matrices
        System.out.println("Enter the number of rows and columns of the matrices:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // Create the matrices
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];

        // Get the elements of the matrices
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Display the menu
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Exit");
        int choice = sc.nextInt();

        // Perform the selected operation
        switch (choice) {
            case 1:
                // Add the matrices
                int[][] sum = new int[rows][cols];
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        sum[i][j] = matrix1[i][j] + matrix2[i][j];
                    }
                }

                // Display the sum of the matrices
                System.out.println("The sum of the matrices is:");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.print(sum[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 2:
                // Multiply the matrices
                int[][] product = new int[rows][cols];
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        product[i][j] = 0;
                        for (int k = 0; k < cols; k++) {
                            product[i][j] += matrix1[i][k] * matrix2[k][j];
                        }
                    }
                }

                // Display the product of the matrices
                System.out.println("The product of the matrices is:");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.print(product[i][j] + " ");
                    }
                    System.out.println();
                }
                break;
            case 3:
                // Exit the program
                System.out.println("Exiting the program...");
                break;
            default:
                // Invalid choice
                System.out.println("Invalid choice. Please enter a valid choice.");
        }
    }
}
