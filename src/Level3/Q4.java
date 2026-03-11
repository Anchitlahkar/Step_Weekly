
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        double weightInPounds;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight in pounds: ");
        weightInPounds = input.nextDouble();
        double weightInKg = weightInPounds / 2.2;
        System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kg is " + weightInKg);
        input.close();
    }
}
