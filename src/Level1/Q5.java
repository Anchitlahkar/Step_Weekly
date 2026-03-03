
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        double heightCm;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        heightCm = input.nextDouble();
        double inches = heightCm / 2.54;
        double feet = inches / 12;
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches);
        input.close();
    }
}
