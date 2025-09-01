import java.util.Scanner;

public class NestedLoopCharacterFrequency {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] frequencyResult = characterFrequencies(text);

        System.out.println("Character | Frequency");
        System.out.println("--------------------");
        for (String entry : frequencyResult) {
            System.out.println(entry);
        }

        sc.close();
    }

    // Method to find frequency of characters using nested loops
    public static String[] characterFrequencies(String text) {
        char[] chars = text.toCharArray(); // convert string to char array
        int length = chars.length;
        int[] freq = new int[length]; // store frequency of each character

        // Initialize frequencies using nested loops
        for (int i = 0; i < length; i++) {
            if (chars[i] == '0') continue; // skip already counted duplicates
            freq[i] = 1; // initialize frequency
            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicates as counted
                }
            }
        }

        // Count unique characters to size the result array
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') uniqueCount++;
        }

        // Store character and its frequency in a string array
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + "         | " + freq[i];
                index++;
            }
        }

        return result;
    }
}
