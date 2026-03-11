
import java.util.Scanner;

/**
 * Question: Create a program to count the number of digits in an integer. Hint
 * => 1. Get integer input for 'number'. 2. Create 'count' = 0. 3. Loop until
 * number is not 0. 4. Remove last digit (number / 10). 5. Increase count by 1.
 */
public class CountDigits {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            int count = 0;
            int temp = Math.abs(number); // handle negative numbers

            if (temp == 0) {
                count = 1;
            } else {
                while (temp != 0) {
                    temp /= 10;
                    count++;
                }
            }

            System.out.println("Number of digits: " + count);
            scanner.close();
        }
    }
}
