import java.util.Scanner;

/**
 * Question: Create a program to find all the multiples of a number 
 * taken as user input below 100.
 * Hint => 
 * Get the input value for a variable named number. 
 * Check the number is a positive integer and less than 100.
 * Run a for loop backward: from i = 100 down to 1.
 * Inside the loop, check if i is a multiple of number (i % number == 0). 
 * If true, print the value i.
 */
public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = scanner.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input. Enter a positive integer less than 100.");
        } else {
            System.out.println("Multiples of " + number + " below 100 (backwards):");
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }
        scanner.close();
    }
}
