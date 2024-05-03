import java.util.Enumeration;
import java.util.Hashtable;

public class Student {

    private String name;
    private String mobileNumber;

    public Student(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {
        // Create a hash table to maintain the mobile number and student name
        Hashtable<String, Student> studentHashTable = new Hashtable<>();

        // Add some sample student details to the hash table
        studentHashTable.put("John Doe", new Student("John Doe", "1234567890"));
        studentHashTable.put("Jane Doe", new Student("Jane Doe", "0987654321"));

        // Display the details of the student using the Enumeration interface
        Enumeration<Student> students = studentHashTable.elements();
        while (students.hasMoreElements()) {
            Student student = students.nextElement();
            System.out.println(student);
        }
    }
}
