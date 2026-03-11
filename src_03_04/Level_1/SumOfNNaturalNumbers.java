
import java.util.Scanner;

/**
 * Question: Write a program to find the sum of n natural numbers using while
 * loop compare the result with the formulae n*(n+1)/2 and show the result from
 * both computations was correct. Hint => Take the user input number and check
 * whether it's a Natural number. If it's a natural number Compute using
 * formulae as well as compute using while loop. Compare the two results and
 * print the result.
 */
public class SumOfNNaturalNumbers {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a positive integer n: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Please enter a natural number (greater than 0).");
            } else {
                // Using while loop
                int sumLoop = 0;
                int i = 1;
                while (i <= n) {
                    sumLoop += i;
                    i++;
                }

                // Using formula
                int sumFormula = n * (n + 1) / 2;

                System.out.println("Sum using while loop: " + sumLoop);
                System.out.println("Sum using formula: " + sumFormula);

                if (sumLoop == sumFormula) {
                    System.out.println("Both computations are correct and match!");
                } else {
                    System.out.println("There is a mismatch in computations.");
                }
            }
            scanner.close();
        }
    }
}
