import java.util.*;

class Vehicle {
    String Company;
    double price;

    Vehicle(String Company, double price) {
        this.Company = Company;
        this.price = price;
    }
}

class LightMotorVehicle extends Vehicle {
    double mileage;

    LightMotorVehicle(String Company, double price, double mileage) {
        super(Company, price);
        this.mileage = mileage;
    }

    void display() {
        System.out.println("Company: " + Company);
        System.out.println("Price: " + price);
        System.out.println("Mileage: " + mileage);
    }
}

class HeavyMotorVehicle extends Vehicle {
    double capacity_in_tons;

    HeavyMotorVehicle(String Company, double price, double capacity_in_tons) {
        super(Company, price);
        this.capacity_in_tons = capacity_in_tons;
    }

    void display() {
        System.out.println("Company: " + Company);
        System.out.println("Price: " + price);
        System.out.println("Capacity in Tons: " + capacity_in_tons);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of vehicles: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the type of vehicle (1 for Light Motor Vehicle, 2 for Heavy Motor Vehicle): ");
            int type = scanner.nextInt();
            System.out.println("Enter the company: ");
            String company = scanner.next();
            System.out.println("Enter the price: ");
            double price = scanner.nextDouble();
            if (type == 1) {
                System.out.println("Enter the mileage: ");
                double mileage = scanner.nextDouble();
                LightMotorVehicle lmv = new LightMotorVehicle(company, price, mileage);
                lmv.display();
            } else if (type == 2) {
                System.out.println("Enter the capacity in tons: ");
                double capacity_in_tons = scanner.nextDouble();
                HeavyMotorVehicle hmv = new HeavyMotorVehicle(company, price, capacity_in_tons);
                hmv.display();
            } else {
                System.out.println("Invalid vehicle type.");
            }
        }
    }
}

