public class BMICalculator {
    public static void main(String[] args) {
        if(args.length < 4) {
            System.out.println("Please provide First Name, Last Name, Weight (in kg), and Height (in meters) as command line arguments.");
            return;
        }

        String firstName = args[0];
        String lastName = args[1];
        double weight = Double.parseDouble(args[2]);
        double height = Double.parseDouble(args[3]);

        double bmi = calculateBMI(weight, height);

        System.out.println("Hello " + firstName + " " + lastName + ", your BMI is: " + bmi);
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
}

