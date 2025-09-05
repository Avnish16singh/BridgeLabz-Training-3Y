package ClassesAndObjects.Level2;
import java.util.ArrayList;
import java.util.Iterator;

// CartItem class
class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate cost of this item
    double getItemCost() {
        return price * quantity;
    }

    // Method to display item details
    void displayItem() {
        System.out.println(itemName + " (x" + quantity + ") - Rs. " + getItemCost());
    }
}

// ShoppingCart class
class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<>();

    // Method to add an item
    void addItem(String name, double price, int qty) {
        items.add(new CartItem(name, price, qty));
        System.out.println(qty + " x " + name + " added to cart.");
    }

    // Method to remove an item
    void removeItem(String name) {
        Iterator<CartItem> itr = items.iterator();
        boolean found = false;
        while (itr.hasNext()) {
            CartItem item = itr.next();
            if (item.itemName.equalsIgnoreCase(name)) {
                itr.remove();
                System.out.println(name + " removed from cart.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(name + " not found in cart.");
        }
    }

    // Method to display total cost
    void displayTotalCost() {
        double total = 0;
        System.out.println("\n🛒 Cart Summary:");
        for (CartItem item : items) {
            item.displayItem();
            total += item.getItemCost();
        }
        System.out.println("Total Cost: Rs. " + total);
    }
}
public class ShoppingCartDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Adding items
        cart.addItem("Laptop", 55000, 1);
        cart.addItem("Headphones", 1500, 2);
        cart.addItem("Mouse", 700, 1);

        // Display total
        cart.displayTotalCost();

        // Remove an item
        cart.removeItem("Headphones");

        // Display total again
        cart.displayTotalCost();
    }
}
