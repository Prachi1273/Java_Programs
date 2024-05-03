import java.util.*;

class Customer {
    int custno;
    String custname;
    String contactnumber;
    String custaddr;

    Customer(int custno, String custname, String contactnumber, String custaddr) {
        this.custno = custno;
        this.custname = custname;
        this.contactnumber = contactnumber;
        this.custaddr = custaddr;
    }

    static void searchCustomer(ArrayList<Customer> customers, String contact) {
        for (Customer customer : customers) {
            if (customer.contactnumber.equals(contact)) {
                System.out.println("Customer Number: " + customer.custno);
                System.out.println("Customer Name: " + customer.custname);
                System.out.println("Contact Number: " + customer.contactnumber);
                System.out.println("Customer Address: " + customer.custaddr);
                return;
            }
        }
        System.out.println("No customer found with the given contact number.");
    }

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "John Doe", "1234567890", "123 Main St"));
        customers.add(new Customer(2, "Jane Doe", "0987654321", "456 Maple Dr"));

        searchCustomer(customers, "1234567890");
    }
}

