
import java.util.Scanner;

/**
 * Question: Create a program to check if a number is armstrong or not. Hint =>
 * Armstrong Number (for this exercise): Sum of cubes of each digit equals the
 * original number. e.g. 153 = 1^3 + 5^3 + 3^3. 1. Get integer input into
 * 'number'. 2. Define 'sum' = 0, 'originalNumber' = input number. 3. While
 * originalNumber != 0: a. Find each digit (originalNumber % 10). b. Add cube of
 * digit to 'sum'. c. Divide originalNumber by 10. 4. Check if number == sum.
 */
public class ArmstrongNumber {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            int originalNumber = number;
            int sum = 0;

            while (originalNumber != 0) {
                int digit = originalNumber % 10;
                sum += (digit * digit * digit);
                originalNumber /= 10;
            }

            if (sum == number) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }
            scanner.close();
        }
    }
}
