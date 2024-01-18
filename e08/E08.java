import java.util.Scanner;

public class E08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Ask the user to enter a number
            System.out.println("Give a number (0 to quit):");
            int number = scanner.nextInt();

    
            if (number == 0) {
                break;
            }

        
            if (number % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
        }

 
        scanner.close();
    }
}
