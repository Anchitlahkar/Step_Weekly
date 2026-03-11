
import java.util.Scanner;

/**
 * Question: Rewrite the program to find the sum until the user enters 0 or a
 * negative number using while loop and break statement. Hint => Use infinite
 * while loop as in while (true) Take the user entry and check if the user
 * entered 0 or a negative number to break the loop using break;
 */
public class SumUntilZeroOrNegative {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double total = 0.0;

            while (true) {
                System.out.print("Enter a number (0 or negative to exit): ");
                double input = scanner.nextDouble();

                if (input <= 0) {
                    break;
                }
                total += input;
            }

            System.out.println("The final sum is: " + total);
            scanner.close();
        }
    }
}
