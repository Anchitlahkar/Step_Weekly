import java.util.Scanner;

/**
 * Question: Create a program to find the power of a number.
 * Hint => 
 * Get integer input for two variables - number and power and check for positive integer.
 * Create a result variable with an initial value of 1.
 * Run a for loop from i = 1 to i <= power. 
 * In each iteration, multiply the result by number.
 * Finally, print the result.
 */
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int number = scanner.nextInt();
        System.out.print("Enter exponent (power): ");
        int power = scanner.nextInt();

        if (power < 0) {
            System.out.println("Exponent should be a non-negative integer.");
        } else {
            long result = 1;
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
            System.out.println(number + "^" + power + " = " + result);
        }
        scanner.close();
    }
}
