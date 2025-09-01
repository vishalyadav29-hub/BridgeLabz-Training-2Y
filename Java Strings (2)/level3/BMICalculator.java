import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int members = 10; // You can make this dynamic if you want
        double[][] data = new double[members][2]; // [weight, height in cm]

        // Taking input for weight and height
        for (int i = 0; i < members; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        // Compute BMI and status
        String[][] result = computeBMI(data);

        // Display results in a table
        displayResult(result);

        sc.close();
    }

    // Method to compute BMI and Status
    public static String[][] computeBMI(double[][] data) {
        int n = data.length;
        String[][] result = new String[n][4]; // [weight, height, BMI, status]

        for (int i = 0; i < n; i++) {
            double weight = data[i][0];
            double heightM = data[i][1] / 100.0; // convert cm to meters
            double bmi = weight / (heightM * heightM);

            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal";
            } else if (bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            result[i][0] = String.format("%.2f", weight);
            result[i][1] = String.format("%.2f", data[i][1]);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }

        return result;
    }

    // Method to display the result in tabular format
    public static void displayResult(String[][] result) {
        System.out.printf("%-12s %-12s %-12s %-12s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("--------------------------------------------------------");
        for (String[] person : result) {
            System.out.printf("%-12s %-12s %-12s %-12s%n", person[0], person[1], person[2], person[3]);
        }
    }
}

