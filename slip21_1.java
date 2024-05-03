import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int n = sc.nextInt();
        LinkedList<String> subjects = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter subject " + (i + 1) + ": ");
            String subject = sc.next();
            subjects.add(subject);
        }
        System.out.println("The subjects are: ");
        Iterator<String> it = subjects.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

