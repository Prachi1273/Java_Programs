import java.util.Scanner;

public class DisplayVowels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the string from the user
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        // Convert the string to lowercase
        str = str.toLowerCase();

        // Display each vowel from the string after every 3 seconds
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch);

                // Wait for 3 seconds
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
