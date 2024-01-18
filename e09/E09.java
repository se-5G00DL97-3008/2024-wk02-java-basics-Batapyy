import java.util.Scanner;

public class E09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int count = 0;

        // Ask the teacher to give test scores until -1 is entered
        while (true) {
            System.out.println("Give a test score (-1 to quit):");
            int score = scanner.nextInt();

            // Check if -1 is entered to quit the loop
            if (score == -1) {
                break;
            }

            // Add the score to the total and increment the count
            total += score;
            count++;

            // Calculate and print the current average
            double average = (double) total / count;
            System.out.println("Average: " + average);
        }

        // Close the scanner
        scanner.close();
    }
}
