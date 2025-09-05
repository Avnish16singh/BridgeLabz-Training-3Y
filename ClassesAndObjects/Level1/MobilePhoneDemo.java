package ClassesAndObjects.Level1;
// MobilePhone class
class MobilePhone {
    // Attributes
    String brand;
    String model;
    double price;

    // Constructor
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display phone details
    void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
    }
}
public class MobilePhoneDemo {
    public static void main(String[] args) {
        // Create MobilePhone objects
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 14", 79999.0);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S23", 74999.0);

        // Display phone details
        phone1.displayDetails();
        System.out.println();
        phone2.displayDetails();
    }
}
