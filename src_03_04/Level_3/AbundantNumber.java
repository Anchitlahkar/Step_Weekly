
import java.util.Scanner;

/**
 * Question: Create a program to check if a number is an Abundant Number. Hint
 * => An abundant number is an integer in which the sum of all its proper
 * divisors is greater than the number itself. Example: Divisor of 12: 1, 2, 3,
 * 4, 6. Sum: 16 > 12. 1. Get integer input for 'number'. 2. Create 'sum' = 0.
 * 3. Run a for loop from i = 1 to i < number.
 * 4. If number % i == 0, add i to 'sum'.
 * 5. Check if sum > number.
 */
public class AbundantNumber {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            int sum = 0;

            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }

            if (sum > number) {
                System.out.println(number + " is an Abundant Number.");
            } else {
                System.out.println(number + " is Not an Abundant Number.");
            }
            scanner.close();
        }
    }
}
