package JavaFundamentals;
    import java.util.Scanner;

public class KM_To_Miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in Kilometers: ");
        double km = sc.nextDouble();
        double miles = km * 0.621371;
        System.out.println("Miles = " + miles);
    }
}


