import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the day
        System.out.println("Enter a day:");
        int day = scanner.nextInt();

        // Ask the user to enter the month
        System.out.println("Enter a month:");
        int month = scanner.nextInt();

        // Check if it's Christmas (day 24 and month 12)
        if (day == 24 && month == 12) {
            System.out.println("Merry Christmas!");
        } else {
            System.out.println("It's not Christmas yet!");
        }

        // Close the scanner
        scanner.close();
    }
}
