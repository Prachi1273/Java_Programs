class Employee {
    private int empid;
    private String empname;
    private String empdesignation;
    private int empsal;

    public Employee(int empid, String empname, String empdesignation, int empsal) {
        this.empid = empid;
        this.empname = empname;
        this.empdesignation = empdesignation;
        this.empsal = empsal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                ", empdesignation='" + empdesignation + '\'' +
                ", empsal=" + empsal +
                '}';
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1, "John Doe", "Software Engineer", 100000);
        System.out.println(employee.toString());
    }
}
