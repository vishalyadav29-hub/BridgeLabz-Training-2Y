import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0 && index < maxDigit) {
            int digit = number % 10;
            digits[index] = digit;
            index++;
            number /= 10;
        }

        if (index == 0) {
            System.out.println("No digits entered!");
            return;
        }

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit = " + largest);
        if (secondLargest == -1) {
            System.out.println("No distinct second largest digit found.");
        } else {
            System.out.println("Second largest digit = " + secondLargest);
        }

        sc.close();
    }
}
