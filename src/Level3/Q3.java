
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        double principal, rate, time;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        principal = input.nextDouble();
        System.out.print("Enter the rate of interest: ");
        rate = input.nextDouble();
        System.out.print("Enter the time in years: ");
        time = input.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);
        input.close();
    }
}
