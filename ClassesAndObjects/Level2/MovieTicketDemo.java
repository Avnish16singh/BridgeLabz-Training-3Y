package ClassesAndObjects.Level2;
// MovieTicket class
class MovieTicket {
    // Attributes
    String movieName;
    String seatNumber;
    double price;
    boolean isBooked;

    // Constructor
    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.isBooked = false;
    }

    // Method to book a ticket
    void bookTicket(String seatNumber, double price) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Ticket already booked for seat: " + this.seatNumber);
        }
    }

    // Method to display ticket details
    void displayDetails() {
        if (isBooked) {
            System.out.println("🎟️ Ticket Details:");
            System.out.println("Movie Name : " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price      : " + price);
        } else {
            System.out.println("No ticket booked yet for " + movieName);
        }
    }
}
public class MovieTicketDemo {
    public static void main(String[] args) {
        // Create a MovieTicket object
        MovieTicket ticket1 = new MovieTicket("Avengers: Endgame");

        // Try displaying before booking
        ticket1.displayDetails();
        System.out.println();

        // Book the ticket
        ticket1.bookTicket("A12", 350.0);
        System.out.println();

        // Display details after booking
        ticket1.displayDetails();
        System.out.println();

        // Attempt to book again
        ticket1.bookTicket("B10", 400.0);
    }
}
