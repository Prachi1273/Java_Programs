package student;

public class StudentInfo {
    private int rollNo;
    private String className;
    private double percentage;

    public StudentInfo(int rollNo, String className, double percentage) {
        this.rollNo = rollNo;
        this.className = className;
        this.percentage = percentage;
    }

    public void displayInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Class: " + className);
        System.out.println("Percentage: " + percentage);
    }
}

package student;

public class StudentPer {
    private int rollNo;
    private String name;
    private String className;
    private double[] marks = new double[6];

    public StudentPer(int rollNo, String name, String className, double[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.className = className;
        this.marks = marks;
    }

    public double calculatePercentage() {
        double totalMarks = 0;
        for (double mark : marks) {
            totalMarks += mark;
        }
        return (totalMarks / (marks.length * 100)) * 100;
    }
}

