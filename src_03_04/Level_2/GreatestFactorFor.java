
import java.util.Scanner;

/**
 * Question: Create a program to print the greatest factor of a number beside
 * itself using a loop. Hint => Get an integer input and assign it to the number
 * variable. As well as define a greatestFactor variable and assign it to 1.
 * Create a for loop that runs from number-1 down to 1. Inside the loop, check
 * if number is perfectly divisible by i, then assign i to greatestFactor and
 * break.
 */
public class GreatestFactorFor {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            int greatestFactor = 1;

            if (number <= 1) {
                System.out.println("The number must be greater than 1.");
            } else {
                for (int i = number - 1; i >= 1; i--) {
                    if (number % i == 0) {
                        greatestFactor = i;
                        break;
                    }
                }
                System.out.println("The greatest factor beside itself is: " + greatestFactor);
            }
            scanner.close();
        }
    }
}
