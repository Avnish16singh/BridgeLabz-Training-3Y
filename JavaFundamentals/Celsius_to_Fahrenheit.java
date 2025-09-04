package JavaFundamentals;

import java.util.Scanner;
class Celsius_to_Fahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();
        double f = (c * 9 / 5) + 32;
        System.out.println("Fahrenheit = " + f);
    }
}
