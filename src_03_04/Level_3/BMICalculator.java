
import java.util.Scanner;

/**
 * Question: Create a program to find the BMI of a person. Hint => 1. Take user
 * input in double for 'weight' (kg) and 'height' (cm). 2. Convert cm to meter
 * (height/100). 3. BMI = weight / (height * height). Note unit is kg/m^2. 4.
 * Determine status using BMI: Below 18.5: Underweight 18.5 – 24.9: Normal
 * weight 25 – 29.9: Overweight 30 or greater: Obese
 */
public class BMICalculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter weight in kg: ");
            double weight = scanner.nextDouble();
            System.out.print("Enter height in cm: ");
            double heightCm = scanner.nextDouble();

            double heightMeter = heightCm / 100.0;
            double bmi = weight / (heightMeter * heightMeter);

            System.out.printf("BMI: %.2f\n", bmi);
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal weight";
            } else if (bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
            System.out.println("Status: " + status);
            scanner.close();
        }
    }
}
