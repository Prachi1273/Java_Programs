import java.util.Scanner;

class InvalidPasswordException extends Exception {
    InvalidPasswordException(String s) {
        super(s);
    }
}

public class Main {
    static void checkPassword(String username, String password) throws InvalidPasswordException {
        if (!username.equals(password)) {
            throw new InvalidPasswordException("Invalid Password");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = scanner.next();
        System.out.println("Enter password: ");
        String password = scanner.next();
        try {
            checkPassword(username, password);
            System.out.println("Login successful");
        } catch (InvalidPasswordException ex) {
            System.out.println("Exception occurred: " + ex);
        }
    }
}

