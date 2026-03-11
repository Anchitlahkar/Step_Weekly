
import java.util.Scanner;

/**
 * Question: Write a program to create a calculator using switch...case. Hint =>
 * 1. Create two double variables 'first' and 'second' and String 'op'. 2. Get
 * input for 'first', 'second', and 'op'. 3. op should be "+", "-", "*" or "/".
 * 4. Perform operation based on 'op' using switch...case. 5. Handle "Invalid
 * Operator" case.
 */
public class Calculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter first number: ");
            double first = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double second = scanner.nextDouble();
            System.out.print("Enter operator (+, -, *, /): ");
            String op = scanner.next();

            switch (op) {
                case "+" -> System.out.println("Result: " + (first + second));
                case "-" -> System.out.println("Result: " + (first - second));
                case "*" -> System.out.println("Result: " + (first * second));
                case "/" -> {
                    if (second != 0) {
                        System.out.println("Result: " + (first / second));
                    } else {
                        System.out.println("Error: Division by zero.");
                    }
                }
                default -> System.out.println("Invalid Operator");
            }
            scanner.close();
        }
    }
}
