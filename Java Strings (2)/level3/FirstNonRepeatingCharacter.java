import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char result = findFirstNonRepeatingChar(text);

        if (result != 0) {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }

    // Method to find the first non-repeating character
    public static char findFirstNonRepeatingChar(String text) {
        if (text == null || text.isEmpty()) {
            return 0; // handle empty or null input
        }

        int[] freq = new int[256]; // ASCII character frequencies
        int length = getLength(text);

        // Count frequency of each character
        for (int i = 0; i < length; i++) {
            freq[text.charAt(i)]++;
        }

        // Find the first non-repeating character
        for (int i = 0; i < length; i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return 0; // return 0 if no non-repeating character found
    }

    // Method to find length of string without using length()
    public static int getLength(String text) {
        int count = 0;
        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }
}
