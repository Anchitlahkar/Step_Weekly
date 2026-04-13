import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        long tempNumber = Math.abs(number);

        // Count digits
        int count = 0;
        if (tempNumber == 0) {
            count = 1;
        } else {
            long n = tempNumber;
            while (n != 0) {
                n /= 10;
                count++;
            }
        }

        // Store digits in array
        int[] digits = new int[count];
        long n = tempNumber;
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = (int) (n % 10);
            n /= 10;
        }

        // Find frequency
        int[] frequency = new int[10];
        for (int digit : digits) {
            frequency[digit]++;
        }

        // Display frequency
        System.out.println("Frequency of each digit in " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
        sc.close();
    }
}
