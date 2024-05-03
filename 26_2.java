import java.io.*;
import java.util.*;
import java.time.*;

class Donor implements Serializable {
    String name;
    int age;
    String address;
    String contactnumber;
    String bloodgroup;
    LocalDate lastDonation;

    Donor(String name, int age, String address, String contactnumber, String bloodgroup, LocalDate lastDonation) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.contactnumber = contactnumber;
        this.bloodgroup = bloodgroup;
        this.lastDonation = lastDonation;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Donor> donors = new ArrayList<>();
        // Add donors to the list
        donors.add(new Donor("John Doe", 30, "123 Main St, Pune", "1234567890", "A+ve", LocalDate.of(2023, 1, 1)));
        // ...

        // Write donors to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("donors.dat"))) {
            oos.writeObject(donors);
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }

        // Read donors from the file and display donors with blood group 'A+ve' who have not donated for the recent six months
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("donors.dat"))) {
            ArrayList<Donor> readDonors = (ArrayList<Donor>) ois.readObject();
            for (Donor donor : readDonors) {
                if (donor.bloodgroup.equals("A+ve") && donor.lastDonation.isBefore(LocalDate.now().minusMonths(6))) {
                    System.out.println("Name: " + donor.name);
                    System.out.println("Age: " + donor.age);
                    System.out.println("Address: " + donor.address);
                    System.out.println("Contact Number: " + donor.contactnumber);
                    System.out.println("Blood Group: " + donor.bloodgroup);
                    System.out.println("Date of Last Donation: " + donor.lastDonation);
                    System.out.println();
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading from file");
        }
    }
}

