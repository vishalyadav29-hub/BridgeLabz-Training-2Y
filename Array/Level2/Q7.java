import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            double weight, height;

            while (true) {
                System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
                weight = sc.nextDouble();
                if (weight > 0) break;
                System.out.println("Invalid! Weight must be positive.");
            }

            while (true) {
                System.out.print("Enter height (m) of person " + (i + 1) + ": ");
                height = sc.nextDouble();
                if (height > 0) break;
                System.out.println("Invalid! Height must be positive.");
            }

            personData[i][0] = weight;
            personData[i][1] = height;

            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("\nResults:");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) +
                               ": Height = " + personData[i][1] + " m, " +
                               "Weight = " + personData[i][0] + " kg, " +
                               "BMI = " + String.format("%.2f", personData[i][2]) +
                               ", Status = " + weightStatus[i]);
        }

        sc.close();
    }
}
