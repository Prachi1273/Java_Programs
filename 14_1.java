import java.util.Scanner;

class ZeroException extends Exception {
    ZeroException(String s) {
        super(s);
    }
}

public class PrimeCheck {
    static void checkPrime(int num) throws ZeroException {
        if (num == 0)
            throw new ZeroException("Number is 0");
        else {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; ++i) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.println(num + " is a prime number.");
            else
                System.out.println(num + " is not a prime number.");
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        try {
            checkPrime(num);
        } catch (Exception ex) {
            System.out.println("Exception occurred: " + ex);
        }
    }
}

