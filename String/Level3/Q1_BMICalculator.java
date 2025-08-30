import java.util.*;

class Q1_BMICalculator {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }
    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }
    public static String[][] processBMI(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double bmi = calculateBMI(data[i][0], data[i][1]);
            result[i][0] = String.format("%.1f", data[i][1]);
            result[i][1] = String.format("%.1f", data[i][0]);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = getStatus(bmi);
        }
        return result;
    }
    public static void displayResult(String[][] result) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height", "Weight", "BMI", "Status");
        for (String[] r : result)
            System.out.printf("%-10s %-10s %-10s %-15s\n", r[0], r[1], r[2], r[3]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble(); // weight
            data[i][1] = sc.nextDouble(); // height
        }
        displayResult(processBMI(data));
    }
}
