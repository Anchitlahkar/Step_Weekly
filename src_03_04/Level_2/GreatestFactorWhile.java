import java.util.Scanner;

/**
 * Question: Rewrite the above program to print the greatest factor of 
 * a number beside itself using a while loop.
 * Hint => 
 * Get an integer input and assign it to the number variable. 
 * As well as define a greatestFactor variable and assign it to 1.
 * Create a variable counter and assign counter = number - 1. 
 * Use the while loop till the counter is equal to 1.
 * Inside the loop, check if the number is perfectly divisible by the 
 * counter then assign the counter to greatestFactor and break.
 */
public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int greatestFactor = 1;

        if (number <= 1) {
            System.out.println("The number must be greater than 1.");
        } else {
            int counter = number - 1;
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break;
                }
                counter--;
            }
            System.out.println("The greatest factor beside itself is: " + greatestFactor);
        }
        scanner.close();
    }
}
