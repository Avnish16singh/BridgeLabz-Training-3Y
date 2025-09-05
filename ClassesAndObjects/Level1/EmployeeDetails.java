package ClassesAndObjects.Level1;
class Employee {
    // Attributes
    String name;
    int id;
    double salary;

    // Constructor to initialize employee details
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary : " + salary);
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
         // Creating Employee objects
        Employee emp1 = new Employee("Alice", 101, 50000.0);
        Employee emp2 = new Employee("Bob", 102, 60000.0);

        // Displaying details
        emp1.displayDetails();
        System.out.println();
        emp2.displayDetails();
    }
}
