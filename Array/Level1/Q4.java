import java.util.Scanner;
public class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array of size 10
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter numbers (up to 10). Enter 0 or a negative number to stop:");

        while (true) {
            System.out.print("Enter number: ");
            double num = sc.nextDouble();

            
            if (num <= 0) {
                break;
            }

            if (index == 10) {
                System.out.println("Array is full (10 elements max).");
                break;
            }

            numbers[index] = num;
            index++;
        }
        System.out.println("\n--- Numbers Entered ---");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }
        System.out.println("\n\nTotal = " + total);

        sc.close();
    }
}
