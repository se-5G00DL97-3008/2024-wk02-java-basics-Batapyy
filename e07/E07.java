import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the multiplicand
        System.out.println("Which multiplication table to show?");
        int multiplicand = scanner.nextInt();

        // Ask the user until which multiplier
        System.out.println("Until which multiplier should the table show?");
        int maxMultiplier = scanner.nextInt();

     
        for (int i = 0; i <= maxMultiplier; i++) {
            System.out.println(i + " x " + multiplicand + " = " + (i * multiplicand));
        }

        // Close the scanner
        scanner.close();
    }
}
