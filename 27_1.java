class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    double getSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    double travelingAllowance;
    double houseRentAllowance;

    Manager(String name, double baseSalary, double travelingAllowance, double houseRentAllowance) {
        super(name, baseSalary);
        this.travelingAllowance = travelingAllowance;
        this.houseRentAllowance = houseRentAllowance;
    }

    @Override
    double getSalary() {
        return baseSalary + travelingAllowance + houseRentAllowance;
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("John Doe", 50000.0, 10000.0, 15000.0);
        System.out.println("The salary of the manager is " + manager.getSalary());
    }
}

