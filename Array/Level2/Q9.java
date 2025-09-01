import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int number = sc.nextInt();

        int[][] marks = new int[number][3];
        double[] percentages = new double[number];
        char[] grades = new char[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                while (true) {
                    if (j == 0) System.out.print("Physics: ");
                    else if (j == 1) System.out.print("Chemistry: ");
                    else System.out.print("Maths: ");

                    int mark = sc.nextInt();
                    if (mark >= 0) {
                        marks[i][j] = mark;
                        break;
                    } else {
                        System.out.println("Invalid! Marks must be non-negative.");
                    }
                }
            }

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            if (percentages[i] >= 90) grades[i] = 'A';
            else if (percentages[i] >= 75) grades[i] = 'B';
            else if (percentages[i] >= 60) grades[i] = 'C';
            else if (percentages[i] >= 40) grades[i] = 'D';
            else grades[i] = 'F';
        }

        System.out.println("\nResults:");
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1) +
                               ": Physics = " + marks[i][0] +
                               ", Chemistry = " + marks[i][1] +
                               ", Maths = " + marks[i][2] +
                               ", Percentage = " + String.format("%.2f", percentages[i]) +
                               "%, Grade = " + grades[i]);
        }

        sc.close();
    }
}
