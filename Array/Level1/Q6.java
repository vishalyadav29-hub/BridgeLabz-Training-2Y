import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    
        double[] heights = new double[11];
        double sum = 0.0;

        
        System.out.println("Enter the heights of 11 players (in cm):");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];  
        }

        double mean = sum / heights.length;

        System.out.println("\n--- Football Team Stats ---");
        System.out.println("Mean height of players = " + mean + " cm");

        sc.close();
    }
}
