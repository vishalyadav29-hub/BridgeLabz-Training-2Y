import java.util.Scanner;

public class AnagramCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter the second text: ");
        String text2 = sc.nextLine();

        boolean isAnagram = areAnagrams(text1, text2);
        if (isAnagram) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        sc.close();
    }

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String text1, String text2) {
        int length1 = getLength(text1);
        int length2 = getLength(text2);

        // If lengths are different, they cannot be anagrams
        if (length1 != length2) {
            return false;
        }

        int[] freq1 = new int[256]; // frequency array for text1
        int[] freq2 = new int[256]; // frequency array for text2

        // Count character frequencies for text1
        for (int i = 0; i < length1; i++) {
            freq1[text1.charAt(i)]++;
        }

        // Count character frequencies for text2
        for (int i = 0; i < length2; i++) {
            freq2[text2.charAt(i)]++;
        }

        // Compare the frequency arrays
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    // Method to find length of a string without using length()
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
