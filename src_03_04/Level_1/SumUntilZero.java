
import java.util.Scanner;

/**
 * Question: Rewrite program to do the countdown using the for-loop. Also, write
 * a program to find the sum of numbers until the user enters 0. Hint => Create
 * a variable total of type double initialize to 0.0. Also, create a variable to
 * store the double value the user enters. Use the while loop to check if the
 * user entered is 0. If the user entered value is not 0 then inside the while
 * block add user entered value to the total and ask the user to input again.
 */
public class SumUntilZero {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // Countdown part using for loop
            System.out.print("Enter countdown starting value: ");
            int countdown = scanner.nextInt();
            System.out.println("Countdown:");
            for (int i = countdown; i >= 1; i--) {
                System.out.println(i);
            }

            // Sum until 0 part
            double total = 0.0;
            System.out.print("Enter a double number (0 to exit): ");
            double input = scanner.nextDouble();

            while (input != 0) {
                total += input;
                System.out.print("Enter another number (0 to exit): ");
                input = scanner.nextDouble();
            }

            System.out.println("Total value: " + total);
            scanner.close();
        }
    }
}
