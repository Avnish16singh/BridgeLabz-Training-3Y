package ClassesAndObjects.Level1;
// Item class
class Item {
    // Attributes
    int itemCode;
    String itemName;
    double price;

    // Constructor
    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    void displayDetails() {
        System.out.println("Item Details:");
        System.out.println("Item Code : " + itemCode);
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : " + price);
    }

    // Method to calculate total cost
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}
public class InventoryDemo {
    public static void main(String[] args) {
        Item item1 = new Item(101, "Laptop", 55000.0);
        Item item2 = new Item(102, "Headphones", 1500.0);

        // Display details
        item1.displayDetails();
        System.out.println("Total Cost for 2 units: " + item1.calculateTotalCost(2));
        System.out.println();

        item2.displayDetails();
        System.out.println("Total Cost for 5 units: " + item2.calculateTotalCost(5));
    }
}
