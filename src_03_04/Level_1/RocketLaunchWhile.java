
import java.util.Scanner;

/**
 * Question: Write a program to count down the number from the user input value
 * to 1 using a while loop for a rocket launch Hint => Create a variable counter
 * to take user inputted value for the countdown. Use the while loop to check if
 * the counter >= 1 Inside a while loop, print the value of the counter and
 * decrement the counter.
 */
public class RocketLaunchWhile {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter countdown starting value: ");
            int counter = scanner.nextInt();

            while (counter >= 1) {
                System.out.println(counter);
                counter--;
            }
            scanner.close();
        }
    }
}
