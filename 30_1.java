import java.util.*;

class Person {
    String Personname;
    String Aadharno;
    String Panno;

    Person(String Personname, String Aadharno, String Panno) {
        this.Personname = Personname;
        this.Aadharno = Aadharno;
        this.Panno = Panno;
    }

    void display() {
        System.out.println("Person Name: " + this.Personname);
        System.out.println("Aadhar Number: " + this.Aadharno);
        System.out.println("PAN Number: " + this.Panno);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter person name: ");
            String name = scanner.next();
            System.out.println("Enter Aadhar number: ");
            String aadhar = scanner.next();
            System.out.println("Enter PAN number: ");
            String pan = scanner.next();

            Person person = new Person(name, aadhar, pan);
            persons.add(person);
        }

        for (Person person : persons) {
            person.display();
        }
    }
}

