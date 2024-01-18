import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the multiplication table they want to see
        System.out.println("Which multiplication table to show?");
        int multiplier = scanner.nextInt();

        // Print the multiplication table until 10
        System.out.println("Multiplication table for " + multiplier + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " x " + multiplier + " = " + (i * multiplier));
        }

        // Close the scanner
        scanner.close();
    }
}
