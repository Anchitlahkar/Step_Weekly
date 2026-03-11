
import java.util.Scanner;

/**
 * Question: Create a program to check if a number taken from the user is a
 * Harshad Number. Hint => A Harshad number is an integer which is divisible by
 * the sum of its digits. For example, 21 is divided by 3 (2 + 1). 1. Get
 * integer input for 'number'. 2. Create 'sum' = 0. 3. Use a while loop to
 * access each digit. 4. Add each digit to 'sum'. 5. Check if number % sum == 0.
 */
public class HarshadNumber {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            int sum = 0;
            int temp = number;

            while (temp != 0) {
                sum += (temp % 10);
                temp /= 10;
            }

            if (sum != 0 && number % sum == 0) {
                System.out.println(number + " is a Harshad Number.");
            } else {
                System.out.println(number + " is Not a Harshad Number.");
            }
            scanner.close();
        }
    }
}
