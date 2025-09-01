import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        String numStr = Long.toString(Math.abs(number));
        int length = numStr.length();
        int[] digits = new int[length];
        int[] frequency = new int[10];
        for (int i = 0; i < length; i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        for (int digit : digits) {
            frequency[digit]++;
        }
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }
        sc.close();
    }
}
