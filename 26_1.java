public class Item {
    static int count = 0;
    int item_number;
    String item_name;
    double item_price;

    // Default constructor
    public Item() {
        item_number = 0;
        item_name = "";
        item_price = 0.0;
        count++;
    }

    // Parameterized constructor
    public Item(int item_number, String item_name, double item_price) {
        this.item_number = item_number;
        this.item_name = item_name;
        this.item_price = item_price;
        count++;
    }

    // Method to display the contents of an object
    public void display() {
        System.out.println("Item Number: " + item_number);
        System.out.println("Item Name: " + item_name);
        System.out.println("Item Price: " + item_price);
    }

    // Static method to display the count of objects
    public static void displayCount() {
        System.out.println("Total objects created: " + count);
    }

    public static void main(String[] args) {
        Item item1 = new Item(1, "Apple", 0.99);
        item1.display();
        Item.displayCount();

        Item item2 = new Item(2, "Banana", 0.59);
        item2.display();
        Item.displayCount();
    }
}

